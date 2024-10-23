package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.controlador;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Estacion;
import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.service.impl.EstacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EstacionController {

    private final EstacionService estacionService;

    public EstacionController(EstacionService estacionService) {
        this.estacionService = estacionService;
    }

    @GetMapping("/estaciones")
    public List<Estacion> obtenerEstacionesPorUbicacion(@RequestParam String ubicacion) {
        return estacionService.obtenerEstacionesPorUbicacion(ubicacion);
    }
}