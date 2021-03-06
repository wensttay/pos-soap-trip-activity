package br.edu.ifpb.ads.pos.soap.trip.agencia.emb;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 23:27:37
 */
@Embeddable
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VooEmb implements Serializable {
    
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String destino;
    @Column(nullable = false)
    private String compania;
    private Timestamp saida;
    private Timestamp chegada;
    
    public VooEmb() {
        saida = new Timestamp(new Date().getTime());
        chegada = new Timestamp(new Date().getTime());
    }

    public VooEmb(br.edu.ifpb.ads.pos.soap.trip.voo.ws.VooEmb vooEmb) {
        this.code = vooEmb.getCode();
        this.destino = vooEmb.getDestino();
        this.compania = vooEmb.getCompania();
        this.saida = new Timestamp(vooEmb.getSaida().getNanos());
        this.chegada = new Timestamp(vooEmb.getChegada().getNanos());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public Timestamp getSaida() {
        return saida;
    }

    public void setSaida(Timestamp saida) {
        this.saida = saida;
    }

    public Timestamp getChegada() {
        return chegada;
    }

    public void setChegada(Timestamp chegada) {
        this.chegada = chegada;
    }

    @Override
    public String toString() {
        return ", destino=" + destino + ", compania=" + compania;
    }
    
}
