package es.http.service.service;

import java.util.List;

import es.http.service.dto.Curso;



public interface ICursoService {

	//Metodos del CRUD
		public List<Curso> listarCursos(); //Listar All 
		
		public Curso guardarCurso(Curso curso);	//Guarda un Curso CREATE
		
		public Curso cursoXID(int id); //Leer datos de un Curso READ
		
		public Curso actualizarCurso(Curso curso); //Actualiza datos del Curso UPDATE
		
		public void eliminarCurso(int id);// Elimina el Curso DELETE
	

}


