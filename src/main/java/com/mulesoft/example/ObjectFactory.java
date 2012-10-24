
package com.mulesoft.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.example package. 
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

    private final static QName _UpdateAccount_QNAME = new QName("http://examples.mulesoft.com/", "updateAccount");
    private final static QName _UpdateAccountResponse_QNAME = new QName("http://examples.mulesoft.com/", "updateAccountResponse");
    private final static QName _Exception_QNAME = new QName("http://examples.mulesoft.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateAccount }
     * 
     */
    public UpdateAccount createUpdateAccount() {
        return new UpdateAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://examples.mulesoft.com/", name = "updateAccount")
    public JAXBElement<UpdateAccount> createUpdateAccount(UpdateAccount value) {
        return new JAXBElement<UpdateAccount>(_UpdateAccount_QNAME, UpdateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://examples.mulesoft.com/", name = "updateAccountResponse")
    public JAXBElement<UpdateAccountResponse> createUpdateAccountResponse(UpdateAccountResponse value) {
        return new JAXBElement<UpdateAccountResponse>(_UpdateAccountResponse_QNAME, UpdateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://examples.mulesoft.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}