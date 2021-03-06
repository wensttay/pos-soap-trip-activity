
package br.edu.ifpb.ads.pos.soap.trip.passagem.ws;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PassagensService", targetNamespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", wsdlLocation = "http://localhost:8080/pos-soap-trip-passagem/PassagensService?WSDL")
public class PassagensService
    extends Service
{

    private final static URL PASSAGENSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PASSAGENSSERVICE_EXCEPTION;
    private final static QName PASSAGENSSERVICE_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "PassagensService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/pos-soap-trip-passagem/PassagensService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PASSAGENSSERVICE_WSDL_LOCATION = url;
        PASSAGENSSERVICE_EXCEPTION = e;
    }

    public PassagensService() {
        super(__getWsdlLocation(), PASSAGENSSERVICE_QNAME);
    }

    public PassagensService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Passagens
     */
    @WebEndpoint(name = "PassagensPort")
    public Passagens getPassagensPort() {
        return super.getPort(new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "PassagensPort"), Passagens.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Passagens
     */
    @WebEndpoint(name = "PassagensPort")
    public Passagens getPassagensPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "PassagensPort"), Passagens.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PASSAGENSSERVICE_EXCEPTION!= null) {
            throw PASSAGENSSERVICE_EXCEPTION;
        }
        return PASSAGENSSERVICE_WSDL_LOCATION;
    }

}
