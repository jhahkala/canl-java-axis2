/*
 * Copyright (c) Members of the EGEE Collaboration. 2004. See
 * http://www.eu-egee.org/partners/ for details on the copyright holders.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package eu.emi.security.canl.axis2.test;

import java.lang.Exception;
import java.util.Properties;

import org.apache.commons.httpclient.protocol.Protocol;
import org.junit.Test;

import eu.emi.security.canl.axis2.CANLAXIS2SocketFactory;

public class EchoServiceClient {
    
    
    @Test
    public void testConnection() throws Exception{
        Axis2JettyServer.run();
        Properties props = new Properties();
        props.setProperty("truststore", "src/test/certificates");
        props.setProperty("cert", "src/test/cert/trusted_client.cert");
        props.setProperty("key", "src/test/cert/trusted_client.priv");
        props.setProperty("password", "changeit");
        props.setProperty("updateinterval", "0");
        CANLAXIS2SocketFactory.setCurrentProperties(props);
        CANLAXIS2SocketFactory factory = new CANLAXIS2SocketFactory();
        try {
            Protocol.registerProtocol("https", new Protocol("https", factory, 8443));
            EchoServiceStub stub = new EchoServiceStub("https://localhost:8888/services/EchoService");
            GetAttributesResponseDocument doc = stub.getAttributes();

            System.out.println(doc.getGetAttributesResponse().getReturn());
            stub.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        props = new Properties();
        props.setProperty("truststore", "src/test/certificates");
        props.setProperty("proxy", "src/test/cert/trusted_client.proxy.grid_proxy");
        props.setProperty("updateinterval", "0");
        CANLAXIS2SocketFactory.setCurrentProperties(props);
        try {
            Protocol.registerProtocol( "https", new Protocol("https", factory, 8443));
            EchoServiceStub stub = new EchoServiceStub("https://localhost:8888/services/EchoService");
            GetAttributesResponseDocument doc = stub.getAttributes();

            System.out.println(doc.getGetAttributesResponse().getReturn());
            stub.cleanup();
            System.out.println("end of output");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
        
    }

    public static void main(final String[] args) throws java.lang.Exception {
        EchoServiceClient client = new EchoServiceClient();
        client.testConnection();
        System.exit(0);
    }
}
