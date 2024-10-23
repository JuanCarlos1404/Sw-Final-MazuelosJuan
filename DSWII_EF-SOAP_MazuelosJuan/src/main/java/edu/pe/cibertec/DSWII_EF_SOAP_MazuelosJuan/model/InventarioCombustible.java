package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "InventarioCombustibles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventarioCombustible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoCombustible;
    private double cantidadActual;
    private double precioLitro;
    private Date fechaActualizacion;

    @ManyToOne
    @JoinColumn(name = "estacionServicioId")
    private EstacionServicio estacionServicio;
}