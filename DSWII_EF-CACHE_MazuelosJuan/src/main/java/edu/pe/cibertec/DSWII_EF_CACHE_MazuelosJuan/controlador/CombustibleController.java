package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.controlador;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Combustible;
import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.service.impl.CombustibleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CombustibleController {

    private final CombustibleService combustibleService;

    public CombustibleController(CombustibleService combustibleService) {
        this.combustibleService = combustibleService;
    }

    @GetMapping("/combustibles")
    public List<Combustible> obtenerPreciosPorTipo(@RequestParam String tipo) {
        return combustibleService.obtenerPreciosPorTipo(tipo);
    }
}