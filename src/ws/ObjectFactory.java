
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloWord2Response_QNAME = new QName("http://ws/", "HelloWord2Response");
    private final static QName _HelloWordResponse_QNAME = new QName("http://ws/", "HelloWordResponse");
    private final static QName _HelloWord2_QNAME = new QName("http://ws/", "HelloWord2");
    private final static QName _HelloWord_QNAME = new QName("http://ws/", "HelloWord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloWord2Response }
     * 
     */
    public HelloWord2Response createHelloWord2Response() {
        return new HelloWord2Response();
    }

    /**
     * Create an instance of {@link HelloWordResponse }
     * 
     */
    public HelloWordResponse createHelloWordResponse() {
        return new HelloWordResponse();
    }

    /**
     * Create an instance of {@link HelloWord2 }
     * 
     */
    public HelloWord2 createHelloWord2() {
        return new HelloWord2();
    }

    /**
     * Create an instance of {@link HelloWord }
     * 
     */
    public HelloWord createHelloWord() {
        return new HelloWord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWord2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "HelloWord2Response")
    public JAXBElement<HelloWord2Response> createHelloWord2Response(HelloWord2Response value) {
        return new JAXBElement<HelloWord2Response>(_HelloWord2Response_QNAME, HelloWord2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "HelloWordResponse")
    public JAXBElement<HelloWordResponse> createHelloWordResponse(HelloWordResponse value) {
        return new JAXBElement<HelloWordResponse>(_HelloWordResponse_QNAME, HelloWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWord2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "HelloWord2")
    public JAXBElement<HelloWord2> createHelloWord2(HelloWord2 value) {
        return new JAXBElement<HelloWord2>(_HelloWord2_QNAME, HelloWord2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "HelloWord")
    public JAXBElement<HelloWord> createHelloWord(HelloWord value) {
        return new JAXBElement<HelloWord>(_HelloWord_QNAME, HelloWord.class, null, value);
    }

}
