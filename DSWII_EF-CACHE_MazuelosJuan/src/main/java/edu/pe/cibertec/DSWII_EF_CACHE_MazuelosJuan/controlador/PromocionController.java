package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.controlador;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Promocion;
import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.service.impl.PromocionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PromocionController {

    private final PromocionService promocionService;

    public PromocionController(PromocionService promocionService) {
        this.promocionService = promocionService;
    }

    @GetMapping("/promociones")
    public List<Promocion> obtenerPromocionesPorEstacion(@RequestParam Long estacionId) {
        return promocionService.obtenerPromocionesPorEstacion(estacionId);
    }
}