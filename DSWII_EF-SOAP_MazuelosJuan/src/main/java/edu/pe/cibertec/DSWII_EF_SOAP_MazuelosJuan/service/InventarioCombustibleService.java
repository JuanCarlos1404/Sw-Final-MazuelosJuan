package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.model.InventarioCombustible;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.repository.InventarioCombustibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioCombustibleService {
    @Autowired
    private InventarioCombustibleRepository repository;

    public InventarioCombustible crear(InventarioCombustible inventario) {
        return repository.save(inventario);
    }

    public InventarioCombustible actualizar(Long id, InventarioCombustible inventario) {
        InventarioCombustible existente = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No encontrado"));
        existente.setTipoCombustible(inventario.getTipoCombustible());
        existente.setCantidadActual(inventario.getCantidadActual());
        existente.setPrecioLitro(inventario.getPrecioLitro());
        existente.setFechaActualizacion(inventario.getFechaActualizacion());
        return repository.save(existente);
    }

    public List<InventarioCombustible> buscar() {
        return repository.findAll();
    }

    public InventarioCombustible buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No encontrado"));
    }
}