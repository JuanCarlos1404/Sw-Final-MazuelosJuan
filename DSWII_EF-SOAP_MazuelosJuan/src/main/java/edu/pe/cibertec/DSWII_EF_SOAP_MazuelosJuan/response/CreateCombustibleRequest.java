package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import java.math.BigDecimal;

public class CreateCombustibleRequest {

    private String tipo;
    private double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
