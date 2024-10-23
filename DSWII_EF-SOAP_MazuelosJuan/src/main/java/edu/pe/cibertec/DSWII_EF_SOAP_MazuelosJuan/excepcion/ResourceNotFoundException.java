package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.excepcion;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
