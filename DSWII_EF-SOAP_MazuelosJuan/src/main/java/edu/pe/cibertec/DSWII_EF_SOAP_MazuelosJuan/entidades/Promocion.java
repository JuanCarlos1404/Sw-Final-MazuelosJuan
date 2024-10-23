package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private BigDecimal descuento;

    @ManyToOne
    @JoinColumn(name = "estacion_id")
    private Estacion estacion;


}