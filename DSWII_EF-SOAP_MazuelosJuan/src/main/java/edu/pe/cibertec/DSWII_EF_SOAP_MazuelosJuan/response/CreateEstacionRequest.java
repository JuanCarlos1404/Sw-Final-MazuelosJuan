package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.response;

public class CreateEstacionRequest {

    private String nombre;
    private String ubicacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}