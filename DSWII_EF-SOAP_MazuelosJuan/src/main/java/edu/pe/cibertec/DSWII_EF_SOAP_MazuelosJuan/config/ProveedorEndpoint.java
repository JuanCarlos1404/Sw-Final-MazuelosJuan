package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.config;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProveedorEndpoint {
    private static final String NAMESPACE_URI = "http://www.repsol.com/ws";

    @Autowired
    private ProveedorService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetProveedorRequest")
    @ResponsePayload
    public GetProveedorResponse getProveedor(@RequestPayload GetProveedorRequest request) {
        GetProveedorResponse response = new GetProveedorResponse();
        response.setProveedor(service.buscarPorId(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CrearProveedorRequest")
    @ResponsePayload
    public CrearProveedorResponse crearProveedor(@RequestPayload CrearProveedorRequest request) {
        CrearProveedorResponse response = new CrearProveedorResponse();
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre(request.getNombre());
        proveedor.setContacto(request.getContacto());
        proveedor.setProductosSuministrados(request.getProductosSuministrados());
        proveedor.setContratoFechaInicio(request.getContratoFechaInicio());
        proveedor.setContratoFechaFin(request.getContratoFechaFin());
        response.setProveedor(service.crear(proveedor));
        return response;
    }

    // Agregar métodos para actualizar, buscar por id, etc.
}