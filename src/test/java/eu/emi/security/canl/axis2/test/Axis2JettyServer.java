package eu.emi.security.canl.axis2.test;

import java.lang.Exception;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.ArrayList;

import javax.net.ssl.SSLContext;

import org.apache.axis2.transport.http.AxisServlet;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ssl.SslSelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ssl.SslContextFactory;

import eu.emi.security.authn.x509.CrlCheckingMode;
import eu.emi.security.authn.x509.NamespaceCheckingMode;
import eu.emi.security.authn.x509.ProxySupport;
import eu.emi.security.authn.x509.RevocationParameters;
import eu.emi.security.authn.x509.StoreUpdateListener;
import eu.emi.security.authn.x509.impl.CertificateUtils;
import eu.emi.security.authn.x509.impl.CertificateUtils.Encoding;
import eu.emi.security.authn.x509.impl.KeyAndCertCredential;
import eu.emi.security.authn.x509.impl.OpensslCertChainValidator;
import eu.emi.security.authn.x509.impl.SocketFactoryCreator;
import eu.emi.security.authn.x509.impl.ValidatorParams;

public class Axis2JettyServer {
	
	private static Server _server = null;

    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        run();
    }
    
    public static void run() throws Exception{
        StoreUpdateListener listener = new StoreUpdateListener() {
            public void loadingNotification(String location, String type, Severity level, Exception cause) {
                if (level != Severity.NOTIFICATION) {
                    System.out.println("Error when creating or using SSL socket. Type " + type + " level: " + level
                            + " cause: " + cause.getClass() + ":" + cause.getMessage());
                } else {
                    // log successful (re)loading
                }
            }
        };
        
        ArrayList<StoreUpdateListener> listenerList = new ArrayList<StoreUpdateListener>();
        listenerList.add(listener);

        RevocationParameters revParam = new RevocationParameters(CrlCheckingMode.REQUIRE);

        ProxySupport proxySupport = ProxySupport.ALLOW;

        ValidatorParams validatorParams = new ValidatorParams(revParam, proxySupport, listenerList);

        NamespaceCheckingMode namespaceMode = NamespaceCheckingMode.EUGRIDPMA_AND_GLOBUS;

        long intervalMS = 3600000; // update ever hour

        OpensslCertChainValidator validator = new OpensslCertChainValidator("src/test/certificates", namespaceMode,
                intervalMS, validatorParams);
        
        java.security.cert.X509Certificate[] hostCertChain = CertificateUtils.loadCertificateChain(new FileInputStream("src/test/cert/hostcert.pem"), Encoding.PEM); 
        
        PrivateKey hostKey = CertificateUtils.loadPrivateKey(new FileInputStream("src/test/cert/hostkey.pem"), Encoding.PEM, null); 
        
        KeyAndCertCredential credentials;
        try {
            credentials = new KeyAndCertCredential(hostKey, hostCertChain);
        } catch (KeyStoreException e) {
            throw new IOException("Error while creating keystore: " + e + ": " + e.getMessage(), e);
        }
        
        SSLContext sslContext = SocketFactoryCreator.getSSLContext(credentials, validator, new SecureRandom());
        
        SslContextFactory factory = new SslContextFactory();
        factory.setSslContext(sslContext);
        factory.setWantClientAuth(true);
        factory.setNeedClientAuth(true);
        SslSelectChannelConnector connector = new SslSelectChannelConnector(factory);
        
        connector.setPort(8888);
        connector.setHost("localhost");
        Server server = new Server(8888);
        server.setSendServerVersion(false);
        server.setSendDateHeader(false);
        server.setConnectors(new Connector[] { connector });
        
        ServletContextHandler root = new ServletContextHandler(server,"/",ServletContextHandler.SESSIONS);  
        ServletHolder holder=new ServletHolder(new AxisServlet());
        root.addServlet(holder,"/services/*");
        holder.setInitParameter("axis2.repository.path", "src/test/webapps");   
        holder.setInitParameter("axis2.xml.path", "src/test/conf/axis2.xml");
        server.start();
        _server = server;
        
    }
    
    public static void stop() throws java.lang.Exception{
    	_server.stop();
    }

}
