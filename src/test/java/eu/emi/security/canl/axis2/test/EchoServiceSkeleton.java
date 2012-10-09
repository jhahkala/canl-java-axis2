/**
 * EchoServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package eu.emi.security.canl.axis2.test;

import java.lang.Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.cert.X509Certificate;

import javax.servlet.ServletRequest;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.transport.http.HTTPConstants;

/**
 * EchoServiceSkeleton java skeleton for the axisService
 */
public class EchoServiceSkeleton implements EchoServiceSkeletonInterface {

    /**
     * Auto generated method signature
     * 
     * @return getAttributesResponse2
     * @throws RemoteExceptionException
     */

    public eu.emi.security.canl.axis2.test.GetAttributesResponseDocument getAttributes(

    ) throws RemoteExceptionException {
        StringBuffer buf = new StringBuffer();

        buf.append("EchoSecurityService\n\n");

        buf.append("Hello, this is the EchoService web service.\n");
        buf.append("This web service prints out all the security related info available from the client.\n");

        try {
            MessageContext messageContext = MessageContext.getCurrentMessageContext();
            if (messageContext == null) {
                throw new IOException("No MessageContext found, method probably not called inside a web service");
            }

            ServletRequest req = (ServletRequest) messageContext.getProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST);

            if (req == null) {
                buf.append("SOAP Authorization: MC_HTTP_SERVLETREQUEST is null");
                GetAttributesResponseDocument doc = GetAttributesResponseDocument.Factory.newInstance();
                GetAttributesResponseDocument.GetAttributesResponse res = GetAttributesResponseDocument.GetAttributesResponse.Factory
                        .newInstance();
                res.setReturn(buf.toString());
                System.out.println(buf.toString());
                doc.setGetAttributesResponse(res);

                return doc;
            }
            X509Certificate[] cert = (X509Certificate[]) req.getAttribute("javax.servlet.request.X509Certificate");

            // get and store the IP address of the other party
            String remote = req.getRemoteAddr();

            // trigger the initialization of the certificate stuff in request.
            req.getAttribute("javax.servlet.request.key_size");

            // get the session id
            String sslId = (String) req.getAttribute("javax.servlet.request.ssl_session");

            buf.append("Connection from \"" + remote + "\" by " + cert[0].getSubjectX500Principal()+"\n");
            // /////////////////////////////


            buf.append("You're connecting from: " + remote + "\n");
            buf.append("The session ID for this connection is: " + sslId + "\n");
            buf.append("Your DN is: " + cert[0].getSubjectX500Principal() + "\n");
            buf.append("Issued by: " + cert[0].getIssuerX500Principal() + "\n");

            buf.append("Your cert is: \n");
            buf.append(cert[0].toString());
        } catch (Exception e) {
            buf.append("Error while handling the certificate chain:\n");

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            e.printStackTrace();
            buf.append(sw.toString());
            throw new RemoteExceptionException(buf.toString());
        }

        buf.append("\nFinished\n");

        GetAttributesResponseDocument doc = GetAttributesResponseDocument.Factory.newInstance();
        GetAttributesResponseDocument.GetAttributesResponse res = GetAttributesResponseDocument.GetAttributesResponse.Factory
                .newInstance();
        res.setReturn(buf.toString());
        System.out.println(buf.toString());
        doc.setGetAttributesResponse(res);

        return doc;
    }

}
