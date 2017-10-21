
package br.edu.ifpb.ads.pos.soap.trip.voo.ws;

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
@WebServiceClient(name = "VoosService", targetNamespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", wsdlLocation = "http://localhost:8080/pos-soap-trip-passagem/VoosService?WSDL")
public class VoosService
    extends Service
{

    private final static URL VOOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException VOOSSERVICE_EXCEPTION;
    private final static QName VOOSSERVICE_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "VoosService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/pos-soap-trip-passagem/VoosService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VOOSSERVICE_WSDL_LOCATION = url;
        VOOSSERVICE_EXCEPTION = e;
    }

    public VoosService() {
        super(__getWsdlLocation(), VOOSSERVICE_QNAME);
    }

    public VoosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Voos
     */
    @WebEndpoint(name = "VoosPort")
    public Voos getVoosPort() {
        return super.getPort(new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "VoosPort"), Voos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Voos
     */
    @WebEndpoint(name = "VoosPort")
    public Voos getVoosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "VoosPort"), Voos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VOOSSERVICE_EXCEPTION!= null) {
            throw VOOSSERVICE_EXCEPTION;
        }
        return VOOSSERVICE_WSDL_LOCATION;
    }

}