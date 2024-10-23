package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EstacionesServicio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstacionServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ubicacion;
    private int capacidadAlmacen;
    private String gerente;
    private int numeroEmpleados;
    private String tipoCombustible;
    private boolean disponibilidad;
}
