
package com.wang;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MySerImplService", targetNamespace = "http://impl.service.demo.wang.com/", wsdlLocation = "http://localhost:8081/wsSer?wsdl")
public class MySerImplService
    extends Service
{

    private final static URL MYSERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYSERIMPLSERVICE_EXCEPTION;
    private final static QName MYSERIMPLSERVICE_QNAME = new QName("http://impl.service.demo.wang.com/", "MySerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/wsSer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYSERIMPLSERVICE_WSDL_LOCATION = url;
        MYSERIMPLSERVICE_EXCEPTION = e;
    }

    public MySerImplService() {
        super(__getWsdlLocation(), MYSERIMPLSERVICE_QNAME);
    }

    public MySerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYSERIMPLSERVICE_QNAME, features);
    }

    public MySerImplService(URL wsdlLocation) {
        super(wsdlLocation, MYSERIMPLSERVICE_QNAME);
    }

    public MySerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYSERIMPLSERVICE_QNAME, features);
    }

    public MySerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MySerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MySerImpl
     */
    @WebEndpoint(name = "MySerImplPort")
    public MySerImpl getMySerImplPort() {
        return super.getPort(new QName("http://impl.service.demo.wang.com/", "MySerImplPort"), MySerImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MySerImpl
     */
    @WebEndpoint(name = "MySerImplPort")
    public MySerImpl getMySerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.demo.wang.com/", "MySerImplPort"), MySerImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYSERIMPLSERVICE_EXCEPTION!= null) {
            throw MYSERIMPLSERVICE_EXCEPTION;
        }
        return MYSERIMPLSERVICE_WSDL_LOCATION;
    }

}
