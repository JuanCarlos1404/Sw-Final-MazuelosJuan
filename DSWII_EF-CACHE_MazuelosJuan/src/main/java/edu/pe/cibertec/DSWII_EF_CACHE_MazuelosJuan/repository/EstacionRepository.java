package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.repository;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstacionRepository extends JpaRepository<Estacion, Long> {
    List<Estacion> findByUbicacion(String ubicacion);
}
