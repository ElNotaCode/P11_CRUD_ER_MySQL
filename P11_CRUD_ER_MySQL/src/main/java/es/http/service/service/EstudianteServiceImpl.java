package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IEstudianteDAO;
import es.http.service.dto.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
	
	@Autowired
	IEstudianteDAO iEstudianteDAO;

	@Override
	public List<Estudiante> listarEstudiantes() {
		return iEstudianteDAO.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante curso) {
		return iEstudianteDAO.save(curso);
	}

	@Override
	public Estudiante estudianteXID(int id) {
		return iEstudianteDAO.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante curso) {
		return iEstudianteDAO.save(curso);
	}

	@Override
	public void eliminarEstudiante(int id) {
		iEstudianteDAO.deleteById(id);
	}

}
