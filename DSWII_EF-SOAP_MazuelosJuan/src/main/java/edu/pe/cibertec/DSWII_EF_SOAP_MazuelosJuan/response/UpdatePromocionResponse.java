package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePromocionResponse", propOrder = {
        "promocion"
})
public class UpdatePromocionResponse {

    private PromocionResponse promocion;

    public PromocionResponse getPromocion() {
        return promocion;
    }

    public void setPromocion(PromocionResponse promocion) {
        this.promocion = promocion;
    }
}
