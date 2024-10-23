package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.service;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.model.Proveedor;
import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository repository;

    public Proveedor crear(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    public Proveedor actualizar(Long id, Proveedor proveedor) {
        Proveedor existente = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No encontrado"));
        existente.setNombre(proveedor.getNombre());
        existente.setContacto(proveedor.getContacto());
        existente.setProductosSuministrados(proveedor.getProductosSuministrados());
        existente.setContratoFechaInicio(proveedor.getContratoFechaInicio());
        existente.setContratoFechaFin(proveedor.getContratoFechaFin());
        return repository.save(existente);
    }

    public List<Proveedor> buscar() {
        return repository.findAll();
    }

    public Proveedor buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No encontrado"));
    }
}