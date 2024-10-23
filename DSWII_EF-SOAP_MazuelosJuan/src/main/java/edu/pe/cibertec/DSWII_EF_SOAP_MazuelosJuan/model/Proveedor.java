package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String contacto;
    private String productosSuministrados;
    private Date contratoFechaInicio;
    private Date contratoFechaFin;

    @ManyToOne
    @JoinColumn(name = "estacionServicioId")
    private EstacionServicio estacionServicio;
}
