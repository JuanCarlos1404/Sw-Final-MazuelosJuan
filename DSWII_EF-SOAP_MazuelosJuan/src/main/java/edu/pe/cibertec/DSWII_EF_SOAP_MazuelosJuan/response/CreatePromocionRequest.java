package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import java.math.BigDecimal;

public class CreatePromocionRequest {

    private String descripcion;
    private double descuento;
    private Long estacionId;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Long getEstacionId() {
        return estacionId;
    }

    public void setEstacionId(Long estacionId) {
        this.estacionId = estacionId;
    }
}