package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Combustible;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombustibleResponse", propOrder = {
        "id",
        "tipo",
        "precio"
})
public class CombustibleResponse {

    private long id;
    private String tipo;
    private BigDecimal precio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void setCombustible(Combustible combustible) {
    }
}
