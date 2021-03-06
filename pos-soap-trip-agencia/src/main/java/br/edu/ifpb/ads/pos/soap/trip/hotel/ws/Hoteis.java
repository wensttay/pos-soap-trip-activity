
package br.edu.ifpb.ads.pos.soap.trip.hotel.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Hoteis", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hoteis {


    /**
     * 
     * @param arg0
     * @return
     *     returns br.edu.ifpb.ads.pos.soap.trip.hotel.ws.HotelEmb
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarHotelEmb", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.BuscarHotelEmb")
    @ResponseWrapper(localName = "buscarHotelEmbResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.BuscarHotelEmbResponse")
    public HotelEmb buscarHotelEmb(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.ads.pos.soap.trip.hotel.ws.HotelEmb>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarHoteisEmb", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.ListarHoteisEmb")
    @ResponseWrapper(localName = "listarHoteisEmbResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.ListarHoteisEmbResponse")
    public List<HotelEmb> listarHoteisEmb();

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Hotel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarHoteis", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.ListarHoteis")
    @ResponseWrapper(localName = "listarHoteisResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.ListarHoteisResponse")
    public List<Hotel> listarHoteis();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvarHotel", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.SalvarHotel")
    @ResponseWrapper(localName = "salvarHotelResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.SalvarHotelResponse")
    public void salvarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizarHotel", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.AtualizarHotel")
    @ResponseWrapper(localName = "atualizarHotelResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.AtualizarHotelResponse")
    public void atualizarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deletarHotel", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.DeletarHotel")
    @ResponseWrapper(localName = "deletarHotelResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.DeletarHotelResponse")
    public void deletarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Hotel
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarHotel", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.BuscarHotel")
    @ResponseWrapper(localName = "buscarHotelResponse", targetNamespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.hotel.ws.BuscarHotelResponse")
    public Hotel buscarHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
