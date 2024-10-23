package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.config;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service.InventarioCombustibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InventarioCombustibleEndpoint {
    private static final String NAMESPACE_URI = "http://www.repsol.com/ws";

    @Autowired
    private InventarioCombustibleService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetInventarioCombustibleRequest")
    @ResponsePayload
    public GetInventarioCombustibleResponse getInventarioCombustible(@RequestPayload GetInventarioCombustibleRequest request) {
        GetInventarioCombustibleResponse response = new GetInventarioCombustibleResponse();
        response.setInventarioCombustible(service.buscarPorId(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CrearInventarioCombustibleRequest")
    @ResponsePayload
    public CrearInventarioCombustibleResponse crearInventarioCombustible(@RequestPayload CrearInventarioCombustibleRequest request) {
        CrearInventarioCombustibleResponse response = new CrearInventarioCombustibleResponse();
        InventarioCombustible inventario = new InventarioCombustible();
        inventario.setTipoCombustible(request.getTipoCombustible());
        inventario.setCantidadActual(request.getCantidadActual());
        inventario.setPrecioLitro(request.getPrecioLitro());
        inventario.setFechaActualizacion(request.getFechaActualizacion());
        response.setInventarioCombustible(service.crear(inventario));
        return response;
    }

    // Agregar métodos para actualizar, buscar por id, etc.
}