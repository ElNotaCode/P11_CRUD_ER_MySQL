package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Curso;

/**
 * @author Jose
 *
 */
public interface ICursoDAO extends JpaRepository<Curso, Integer>{
	
}
