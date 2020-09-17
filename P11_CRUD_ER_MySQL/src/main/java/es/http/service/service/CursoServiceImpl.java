package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICursoDAO;
import es.http.service.dto.Curso;

@Service
public class CursoServiceImpl implements ICursoService {
	
	@Autowired
	ICursoDAO iCursoDAO;

	@Override
	public List<Curso> listarCursos() {
		return iCursoDAO.findAll();
	}

	@Override
	public Curso guardarCurso(Curso curso) {
		return iCursoDAO.save(curso);
	}

	@Override
	public Curso cursoXID(int id) {
		return iCursoDAO.findById(id).get();
	}

	@Override
	public Curso actualizarCurso(Curso curso) {
		return iCursoDAO.save(curso);
	}

	@Override
	public void eliminarCurso(int id) {
		iCursoDAO.deleteById(id);
	}

}
