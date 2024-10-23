package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.model.EstacionServicio;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.repository.EstacionServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionServicioService {
    @Autowired
    private EstacionServicioRepository repository;

    public EstacionServicio crear(EstacionServicio estacion) {
        return repository.save(estacion);
    }

    public EstacionServicio actualizar(Long id, EstacionServicio estacion) {
        EstacionServicio existente = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No encontrado"));
        existente.setNombre(estacion.getNombre());
        // Actualiza los demás campos
        return repository.save(existente);
    }

    public List<EstacionServicio> buscar() {
        return repository.findAll();
    }

    public EstacionServicio buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No encontrado"));
    }
}