/*
 * An XML document type.
 * Localname: getAttributesResponse
 * Namespace: http://test.axis2.canl.security.emi.eu
 * Java type: eu.emi.security.canl.axis2.test.GetAttributesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.emi.security.canl.axis2.test;


/**
 * A document containing one getAttributesResponse(@http://test.axis2.canl.security.emi.eu) element.
 *
 * This is a complex type.
 */
public interface GetAttributesResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAttributesResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0E6349379D12CE11CCBA36D560BCCF10").resolveHandle("getattributesresponse648bdoctype");
    
    /**
     * Gets the "getAttributesResponse" element
     */
    eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse getGetAttributesResponse();
    
    /**
     * Sets the "getAttributesResponse" element
     */
    void setGetAttributesResponse(eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse getAttributesResponse);
    
    /**
     * Appends and returns a new empty "getAttributesResponse" element
     */
    eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse addNewGetAttributesResponse();
    
    /**
     * An XML getAttributesResponse(@http://test.axis2.canl.security.emi.eu).
     *
     * This is a complex type.
     */
    public interface GetAttributesResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetAttributesResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0E6349379D12CE11CCBA36D560BCCF10").resolveHandle("getattributesresponse6631elemtype");
        
        /**
         * Gets the "return" element
         */
        java.lang.String getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlString xgetReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(java.lang.String xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlString xreturn);
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse newInstance() {
              return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument.GetAttributesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument newInstance() {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.emi.security.canl.axis2.test.GetAttributesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.emi.security.canl.axis2.test.GetAttributesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
