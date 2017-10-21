
package br.edu.ifpb.ads.pos.soap.trip.cliente.ws;

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
@WebService(name = "Clientes", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Clientes {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvar", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Salvar")
    @ResponseWrapper(localName = "salvarResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.SalvarResponse")
    public void salvar(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deletar", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Deletar")
    @ResponseWrapper(localName = "deletarResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.DeletarResponse")
    public void deletar(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.BuscarResponse")
    public Cliente buscar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Cliente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ListarResponse")
    public List<Cliente> listar();

    /**
     * 
     * @param arg0
     * @return
     *     returns br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarEmb", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.BuscarEmb")
    @ResponseWrapper(localName = "buscarEmbResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.BuscarEmbResponse")
    public ClienteEmb buscarEmb(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarEmb", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ListarEmb")
    @ResponseWrapper(localName = "listarEmbResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ListarEmbResponse")
    public List<ClienteEmb> listarEmb();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizar", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Atualizar")
    @ResponseWrapper(localName = "atualizarResponse", targetNamespace = "http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/", className = "br.edu.ifpb.ads.pos.soap.trip.cliente.ws.AtualizarResponse")
    public void atualizar(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

}
