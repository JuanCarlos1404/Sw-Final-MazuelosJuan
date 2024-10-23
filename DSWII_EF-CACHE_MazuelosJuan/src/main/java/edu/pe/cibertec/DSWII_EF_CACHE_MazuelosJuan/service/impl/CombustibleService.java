package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.service.impl;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Combustible;
import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.repository.CombustibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombustibleService {

    @Autowired
    private CombustibleRepository repository;

    @Cacheable("preciosCombustible")
    public List<Combustible> obtenerPreciosPorTipo(String tipo) {
        return repository.findByTipo(tipo);
    }
}