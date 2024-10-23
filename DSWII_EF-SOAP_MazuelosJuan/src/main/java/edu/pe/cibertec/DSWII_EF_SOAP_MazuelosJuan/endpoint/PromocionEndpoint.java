package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.endpoint;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Promocion;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.excepcion.ResourceNotFoundException;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.repositories.PromocionRepository;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response.*;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PromocionEndpoint {

    private static final String NAMESPACE_URI = "http://cibertec.edu.pe/repsol";
    private final PromocionRepository promocionRepository;

    @Autowired
    public PromocionEndpoint(PromocionRepository promocionRepository) {
        this.promocionRepository = promocionRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPromocionRequest")
    @ResponsePayload
    public PromocionResponse getPromocion(@RequestPayload GetPromocionRequest request) {
        PromocionResponse response = new PromocionResponse();
        Promocion promocion = promocionRepository.findById(request.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Promocion not found"));
        response.setPromocion(ConvertUtil.convertToPromocionResponse(promocion));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreatePromocionRequest")
    @ResponsePayload
    public CreatePromocionResponse createPromocion(@RequestPayload CreatePromocionRequest request) {
        Promocion promocion = new Promocion();
        promocion.setDescripcion(request.getDescripcion());
        promocion.setDescuento(request.getDescuento());
        promocion.setEstacion(ConvertUtil.convertToEstacionEntity(request.getEstacion()));
        Promocion savedPromocion = promocionRepository.save(promocion);
        CreatePromocionResponse response = new CreatePromocionResponse();
        response.setPromocion(ConvertUtil.convertToPromocionResponse(savedPromocion));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdatePromocionRequest")
    @ResponsePayload
    public UpdatePromocionResponse updatePromocion(@RequestPayload UpdatePromocionRequest request) {
        Promocion promocion = promocionRepository.findById(request.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Promocion not found"));
        promocion.setDescripcion(request.getDescripcion());
        promocion.setDescuento(request.getDescuento());
        Promocion updatedPromocion = promocionRepository.save(promocion);
        UpdatePromocionResponse response = new UpdatePromocionResponse();
        response.setPromocion(ConvertUtil.convertToPromocionResponse(updatedPromocion));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeletePromocionRequest")
    @ResponsePayload
    public DeletePromocionResponse deletePromocion(@RequestPayload DeletePromocionRequest request) {
        Promocion promocion = promocionRepository.findById(request.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Promocion not found"));
        promocionRepository.delete(promocion);
        DeletePromocionResponse response = new DeletePromocionResponse();
        response.setResult("Promocion deleted successfully");
        return response;
    }
}