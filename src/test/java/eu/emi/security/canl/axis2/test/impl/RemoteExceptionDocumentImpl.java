/*
 * An XML document type.
 * Localname: RemoteException
 * Namespace: http://test.axis2.canl.security.emi.eu
 * Java type: eu.emi.security.canl.axis2.test.RemoteExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package eu.emi.security.canl.axis2.test.impl;
/**
 * A document containing one RemoteException(@http://test.axis2.canl.security.emi.eu) element.
 *
 * This is a complex type.
 */
public class RemoteExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.emi.security.canl.axis2.test.RemoteExceptionDocument
{
    
    public RemoteExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOTEEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://test.axis2.canl.security.emi.eu", "RemoteException");
    
    
    /**
     * Gets the "RemoteException" element
     */
    public eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException getRemoteException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException target = null;
            target = (eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException)get_store().find_element_user(REMOTEEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoteException" element
     */
    public void setRemoteException(eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException remoteException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException target = null;
            target = (eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException)get_store().find_element_user(REMOTEEXCEPTION$0, 0);
            if (target == null)
            {
                target = (eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException)get_store().add_element_user(REMOTEEXCEPTION$0);
            }
            target.set(remoteException);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoteException" element
     */
    public eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException addNewRemoteException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException target = null;
            target = (eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException)get_store().add_element_user(REMOTEEXCEPTION$0);
            return target;
        }
    }
    /**
     * An XML RemoteException(@http://test.axis2.canl.security.emi.eu).
     *
     * This is a complex type.
     */
    public static class RemoteExceptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.emi.security.canl.axis2.test.RemoteExceptionDocument.RemoteException
    {
        
        public RemoteExceptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REMOTEEXCEPTION$0 = 
            new javax.xml.namespace.QName("http://test.axis2.canl.security.emi.eu", "RemoteException");
        
        
        /**
         * Gets the "RemoteException" element
         */
        public java.rmi.xsd.RemoteException getRemoteException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.rmi.xsd.RemoteException target = null;
                target = (java.rmi.xsd.RemoteException)get_store().find_element_user(REMOTEEXCEPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "RemoteException" element
         */
        public boolean isNilRemoteException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.rmi.xsd.RemoteException target = null;
                target = (java.rmi.xsd.RemoteException)get_store().find_element_user(REMOTEEXCEPTION$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RemoteException" element
         */
        public boolean isSetRemoteException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOTEEXCEPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "RemoteException" element
         */
        public void setRemoteException(java.rmi.xsd.RemoteException remoteException)
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.rmi.xsd.RemoteException target = null;
                target = (java.rmi.xsd.RemoteException)get_store().find_element_user(REMOTEEXCEPTION$0, 0);
                if (target == null)
                {
                    target = (java.rmi.xsd.RemoteException)get_store().add_element_user(REMOTEEXCEPTION$0);
                }
                target.set(remoteException);
            }
        }
        
        /**
         * Appends and returns a new empty "RemoteException" element
         */
        public java.rmi.xsd.RemoteException addNewRemoteException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.rmi.xsd.RemoteException target = null;
                target = (java.rmi.xsd.RemoteException)get_store().add_element_user(REMOTEEXCEPTION$0);
                return target;
            }
        }
        
        /**
         * Nils the "RemoteException" element
         */
        public void setNilRemoteException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.rmi.xsd.RemoteException target = null;
                target = (java.rmi.xsd.RemoteException)get_store().find_element_user(REMOTEEXCEPTION$0, 0);
                if (target == null)
                {
                    target = (java.rmi.xsd.RemoteException)get_store().add_element_user(REMOTEEXCEPTION$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RemoteException" element
         */
        public void unsetRemoteException()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOTEEXCEPTION$0, 0);
            }
        }
    }
}
