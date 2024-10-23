package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.service.impl;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Estacion;
import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.repository.EstacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionService {

    @Autowired
    private EstacionRepository repository;

    @Cacheable("estacionesCercanas")
    public List<Estacion> obtenerEstacionesPorUbicacion(String ubicacion) {
        return repository.findByUbicacion(ubicacion);
    }
}
