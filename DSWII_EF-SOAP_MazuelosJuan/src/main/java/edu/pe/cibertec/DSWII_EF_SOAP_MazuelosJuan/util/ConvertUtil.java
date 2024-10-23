package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.util;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Combustible;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Estacion;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Promocion;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.CombustibleResponse;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.EstacionResponse;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.PromocionResponse;

public class ConvertUtil {

    public static CombustibleResponse convertToCombustibleResponse(Combustible combustible) {
        CombustibleResponse response = new CombustibleResponse();
        response.setId(combustible.getId());
        response.setTipo(combustible.getTipo());
        response.setPrecio(combustible.getPrecio());
        return response;
    }

    public static EstacionResponse convertToEstacionResponse(Estacion estacion) {
        EstacionResponse response = new EstacionResponse();
        response.setId(estacion.getId());
        response.setNombre(estacion.getNombre());
        response.setUbicacion(estacion.getUbicacion());
        return response;
    }

    public static PromocionResponse convertToPromocionResponse(Promocion promocion) {
        PromocionResponse response = new PromocionResponse();
        response.setId(promocion.getId());
        response.setDescripcion(promocion.getDescripcion());
        response.setDescuento(promocion.getDescuento());
        response.setEstacion(convertToEstacionResponse(promocion.getEstacion()));
        return response;
    }

    public static Estacion convertToEstacionEntity(EstacionRequest request) {
        Estacion estacion = new Estacion();
        estacion.setNombre(request.getNombre());
        estacion.setUbicacion(request.getUbicacion());
        return estacion;
    }
}
