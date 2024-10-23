package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


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
