
/**
 * RemoteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package eu.emi.security.canl.axis2.test;

public class RemoteExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1351000192400L;
    
    private eu.emi.security.canl.axis2.test.RemoteExceptionDocument faultMessage;

    
        public RemoteExceptionException() {
            super("RemoteExceptionException");
        }

        public RemoteExceptionException(java.lang.String s) {
           super(s);
        }

        public RemoteExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RemoteExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(eu.emi.security.canl.axis2.test.RemoteExceptionDocument msg){
       faultMessage = msg;
    }
    
    public eu.emi.security.canl.axis2.test.RemoteExceptionDocument getFaultMessage(){
       return faultMessage;
    }
}
    