package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.repository;

import edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan.model.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromocionRepository extends JpaRepository<Promocion, Long> {
    List<Promocion> findByEstacionId(Long estacionId);
}
