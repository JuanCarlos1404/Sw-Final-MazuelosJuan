package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromocionResponse", propOrder = {
        "id",
        "descripcion",
        "descuento",
        "estacion"
})
public class PromocionResponse {

    private long id;
    private String descripcion;
    private BigDecimal descuento;
    private EstacionResponse estacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public EstacionResponse getEstacion() {
        return estacion;
    }

    public void setEstacion(EstacionResponse estacion) {
        this.estacion = estacion;
    }
}

