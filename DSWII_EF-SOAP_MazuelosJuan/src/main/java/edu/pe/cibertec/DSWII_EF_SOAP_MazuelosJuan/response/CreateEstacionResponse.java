package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateEstacionResponse", propOrder = {
        "estacion"
})
public class CreateEstacionResponse {

    private EstacionResponse estacion;

    public EstacionResponse getEstacion() {
        return estacion;
    }

    public void setEstacion(EstacionResponse estacion) {
        this.estacion = estacion;
    }
}
