package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCombustibleResponse", propOrder = {
        "combustible"
})
public class CreateCombustibleResponse {

    private CombustibleResponse combustible;

    public CombustibleResponse getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustibleResponse combustible) {
        this.combustible = combustible;
    }
}
