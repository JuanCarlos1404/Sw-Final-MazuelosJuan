package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.endpoint;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Combustible;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.repositories.CombustibleRepository;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.CombustibleResponse;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.GetCombustibleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CombustibleEndpoint {

    private static final String NAMESPACE_URI = "http://cibertec.edu.pe/repsol";

    private final CombustibleRepository combustibleRepository;

    @Autowired
    public CombustibleEndpoint(CombustibleRepository repository) {
        this.combustibleRepository = repository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCombustibleRequest")
    @ResponsePayload
    public CombustibleResponse getCombustible(@RequestPayload GetCombustibleRequest request) {
        CombustibleResponse response = new CombustibleResponse();
        Combustible combustible = combustibleRepository.findById(request.getId()).orElse(null);
        response.setCombustible(combustible); // You will need to adapt this to your JAXB generated class
        return response;
    }


}