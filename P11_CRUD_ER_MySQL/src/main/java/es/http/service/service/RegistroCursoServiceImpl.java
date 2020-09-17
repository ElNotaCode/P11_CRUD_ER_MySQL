package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IRegistroCursoDAO;
import es.http.service.dto.RegistroCurso;

@Service
public class RegistroCursoServiceImpl implements IRegistroCursoService {
	
	@Autowired
	IRegistroCursoDAO iRegistroCursoDAO;

	@Override
	public List<RegistroCurso> listarRegistroCurso() {
		return iRegistroCursoDAO.findAll();
	}

	@Override
	public RegistroCurso guardarRegistroCurso(RegistroCurso curso) {
		return iRegistroCursoDAO.save(curso);
	}

	@Override
	public RegistroCurso registroCursoXID(int id) {
		return iRegistroCursoDAO.findById(id).get();
	}

	@Override
	public RegistroCurso actualizarRegistroCurso(RegistroCurso curso) {
		return iRegistroCursoDAO.save(curso);
	}

	@Override
	public void eliminarRegistroCurso(int id) {
		iRegistroCursoDAO.deleteById(id);
	}

}
