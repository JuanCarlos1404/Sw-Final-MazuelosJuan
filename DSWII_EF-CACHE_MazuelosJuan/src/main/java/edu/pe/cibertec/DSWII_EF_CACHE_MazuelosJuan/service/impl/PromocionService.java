package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.service.impl;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Promocion;
import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.repository.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionService {

    @Autowired
    private PromocionRepository repository;

    @Cacheable("promocionesActivas")
    public List<Promocion> obtenerPromocionesPorEstacion(Long estacionId) {
        return repository.findByEstacionId(estacionId);
    }
}