/*
 * An XML document type.
 * Localname: getAttributesResponse
 * Namespace: http://test.axis2.canl.security.emi.eu
 * Java type: eu.emi.security.canl.axis2.test.GetAttributesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.emi.security.canl.axis2.test.impl;
/**
 * A document containing one getAttributesResponse(@http://test.axis2.canl.security.emi.eu) element.
 *
 * This is a complex type.
 */
public class GetAttributesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.emi.security.canl.axis2.test.GetAttributesResponseDocument
{
    
    public GetAttributesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETATTRIBUTESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://test.axis2.canl.security.emi.eu", "getAttributesResponse");
    
    
    /**
     * Gets the "getAttributesResponse" element
     */
    public eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse getGetAttributesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse target = null;
            target = (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse)get_store().find_element_user(GETATTRIBUTESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAttributesResponse" element
     */
    public void setGetAttributesResponse(eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse getAttributesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse target = null;
            target = (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse)get_store().find_element_user(GETATTRIBUTESRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse)get_store().add_element_user(GETATTRIBUTESRESPONSE$0);
            }
            target.set(getAttributesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAttributesResponse" element
     */
    public eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse addNewGetAttributesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse target = null;
            target = (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse)get_store().add_element_user(GETATTRIBUTESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getAttributesResponse(@http://test.axis2.canl.security.emi.eu).
     *
     * This is a complex type.
     */
    public static class GetAttributesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse
    {
        
        public GetAttributesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://test.axis2.canl.security.emi.eu", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
