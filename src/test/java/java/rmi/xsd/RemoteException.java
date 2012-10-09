/*
 * XML Type:  RemoteException
 * Namespace: http://rmi.java/xsd
 * Java type: java.rmi.xsd.RemoteException
 *
 * Automatically generated - do not modify.
 */
package java.rmi.xsd;


/**
 * An XML RemoteException(@http://rmi.java/xsd).
 *
 * This is a complex type.
 */
public interface RemoteException extends java.io.xsd.IOException
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoteException.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266AAFE64D6934F5DC90C8E8823C6EF4").resolveHandle("remoteexception9b8etype");
    
    /**
     * Gets the "cause" element
     */
    org.apache.xmlbeans.XmlObject getCause();
    
    /**
     * Tests for nil "cause" element
     */
    boolean isNilCause();
    
    /**
     * True if has "cause" element
     */
    boolean isSetCause();
    
    /**
     * Sets the "cause" element
     */
    void setCause(org.apache.xmlbeans.XmlObject cause);
    
    /**
     * Appends and returns a new empty "cause" element
     */
    org.apache.xmlbeans.XmlObject addNewCause();
    
    /**
     * Nils the "cause" element
     */
    void setNilCause();
    
    /**
     * Unsets the "cause" element
     */
    void unsetCause();
    
    /**
     * Gets the "message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * Tests for nil "message" element
     */
    boolean isNilMessage();
    
    /**
     * True if has "message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Nils the "message" element
     */
    void setNilMessage();
    
    /**
     * Unsets the "message" element
     */
    void unsetMessage();
    
    /**
     * Gets the "detail" element
     */
    org.apache.xmlbeans.XmlObject getDetail();
    
    /**
     * Tests for nil "detail" element
     */
    boolean isNilDetail();
    
    /**
     * True if has "detail" element
     */
    boolean isSetDetail();
    
    /**
     * Sets the "detail" element
     */
    void setDetail(org.apache.xmlbeans.XmlObject detail);
    
    /**
     * Appends and returns a new empty "detail" element
     */
    org.apache.xmlbeans.XmlObject addNewDetail();
    
    /**
     * Nils the "detail" element
     */
    void setNilDetail();
    
    /**
     * Unsets the "detail" element
     */
    void unsetDetail();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static java.rmi.xsd.RemoteException newInstance() {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static java.rmi.xsd.RemoteException newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static java.rmi.xsd.RemoteException parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static java.rmi.xsd.RemoteException parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static java.rmi.xsd.RemoteException parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static java.rmi.xsd.RemoteException parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static java.rmi.xsd.RemoteException parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static java.rmi.xsd.RemoteException parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static java.rmi.xsd.RemoteException parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static java.rmi.xsd.RemoteException parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static java.rmi.xsd.RemoteException parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static java.rmi.xsd.RemoteException parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (java.rmi.xsd.RemoteException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
