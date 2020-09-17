package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Estudiante;

/**
 * @author Jose
 *
 */
public interface IEstudianteDAO extends JpaRepository<Estudiante, Integer>{
	
}
