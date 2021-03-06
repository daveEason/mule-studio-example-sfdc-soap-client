
package com.mulesoft.example;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-10-24T10:33:15.890-07:00
 * Generated source version: 2.5.1
 * 
 */
public final class AccountUpdate_AccountUpdatePort_Client {

    private static final QName SERVICE_NAME = new QName("http://examples.mulesoft.com/", "AccountUpdateService");

    private AccountUpdate_AccountUpdatePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AccountUpdateService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AccountUpdateService ss = new AccountUpdateService(wsdlURL, SERVICE_NAME);
        AccountUpdate port = ss.getAccountUpdatePort();  
        
        {
        System.out.println("Invoking updateAccount...");
        java.lang.String _updateAccount_accountNameId = "";
        try {
            java.lang.String _updateAccount__return = port.updateAccount(_updateAccount_accountNameId);
            System.out.println("updateAccount.result=" + _updateAccount__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
