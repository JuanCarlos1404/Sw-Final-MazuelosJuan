package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.config;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service.EstacionServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EstacionServicioEndpoint {
    private static final String NAMESPACE_URI = "http://www.repsol.com/ws";

    @Autowired
    private EstacionServicioService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetEstacionServicioRequest")
    @ResponsePayload
    public GetEstacionServicioResponse getEstacionServicio(@RequestPayload GetEstacionServicioRequest request) {
        GetEstacionServicioResponse response = new GetEstacionServicioResponse();
        response.setEstacion(service.buscarPorId(request.getId()));
        return response;
    }

    // Otros métodos SOAP...
}