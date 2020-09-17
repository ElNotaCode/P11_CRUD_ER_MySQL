package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.RegistroCurso;

/**
 * @author Jose
 *
 */
public interface IRegistroCursoDAO extends JpaRepository<RegistroCurso, Integer>{
	
}
