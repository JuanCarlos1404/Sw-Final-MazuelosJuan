package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
public class VentaCombustible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal cantidad;

    private BigDecimal precioTotal;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "combustible_id")
    private Combustible combustible;

    @ManyToOne
    @JoinColumn(name = "estacion_id")
    private Estacion estacion;

}