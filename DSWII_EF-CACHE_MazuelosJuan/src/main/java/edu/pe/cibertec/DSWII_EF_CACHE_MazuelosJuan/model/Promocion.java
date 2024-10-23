package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long estacionId;
    private String descripcion;
    private boolean activa;

    // Getters y Setters
}
