package es.http.service.service;

import java.util.List;

import es.http.service.dto.RegistroCurso;

public interface IRegistroCursoService {

	//Metodos del CRUD
		public List<RegistroCurso> listarRegistroCurso(); //Listar All 
		
		public RegistroCurso guardarRegistroCurso(RegistroCurso registroCurso);	//Guarda un RegistroCurso CREATE
		
		public RegistroCurso registroCursoXID(int id); //Leer datos de un RegistroCurso READ
		
		public RegistroCurso actualizarRegistroCurso(RegistroCurso registroCurso); //Actualiza datos del RegistroCurso UPDATE
		
		public void eliminarRegistroCurso(int id);// Elimina el RegistroCurso DELETE
	
}


