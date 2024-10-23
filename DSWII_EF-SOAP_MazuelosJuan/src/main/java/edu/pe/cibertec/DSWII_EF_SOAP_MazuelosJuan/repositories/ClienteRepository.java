package edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.repositories;

import edu.pe.cibertec.DSWII_EF_SOAP_MazuelosJuan.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
