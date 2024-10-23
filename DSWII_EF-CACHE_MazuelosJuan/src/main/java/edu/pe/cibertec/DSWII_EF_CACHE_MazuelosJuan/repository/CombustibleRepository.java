package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.repository;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Combustible;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CombustibleRepository extends JpaRepository<Combustible, Long> {
    List<Combustible> findByTipo(String tipo);
}
