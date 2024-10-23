package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.endpoint;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Combustible;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.*;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service.impl.CombustibleService;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CombustibleEndpoint {

    private static final String NAMESPACE_URI = "http://cibertec.edu.pe/soapws";

    @Autowired
    private CombustibleService combustibleService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCombustibleRequest")
    @ResponsePayload
    public CombustibleResponse getCombustible(@RequestPayload GetCombustibleRequest request) {
        Combustible combustible = combustibleService.findById(request.getId());
        return ConvertUtil.convertToCombustibleResponse(combustible);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createCombustibleRequest")
    @ResponsePayload
    public CreateCombustibleResponse createCombustible(@RequestPayload CreateCombustibleRequest request) {
        Combustible combustible = new Combustible();
        combustible.setTipo(request.getTipo());
        combustible.setPrecio(request.getPrecio());
        Combustible savedCombustible = combustibleService.save(combustible);

        CreateCombustibleResponse response = new CreateCombustibleResponse();
        response.setCombustible(ConvertUtil.convertToCombustibleResponse(savedCombustible));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateCombustibleRequest")
    @ResponsePayload
    public UpdateCombustibleResponse updateCombustible(@RequestPayload UpdateCombustibleRequest request) {
        Combustible combustible = combustibleService.findById(request.getId());
        combustible.setTipo(request.getTipo());
        combustible.setPrecio(request.getPrecio());
        Combustible updatedCombustible = combustibleService.save(combustible);

        UpdateCombustibleResponse response = new UpdateCombustibleResponse();
        response.setCombustible(ConvertUtil.convertToCombustibleResponse(updatedCombustible));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteCombustibleRequest")
    @ResponsePayload
    public DeleteCombustibleResponse deleteCombustible(@RequestPayload DeleteCombustibleRequest request) {
        combustibleService.deleteById(request.getId());

        DeleteCombustibleResponse response = new DeleteCombustibleResponse();
        response.setResult("Combustible deleted successfully");
        return response;
    }
}

