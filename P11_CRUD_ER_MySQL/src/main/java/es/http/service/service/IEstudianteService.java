package es.http.service.service;

import java.util.List;

import es.http.service.dto.Estudiante;

public interface IEstudianteService {

	//Metodos del CRUD
		public List<Estudiante> listarEstudiantes(); //Listar All 
		
		public Estudiante guardarEstudiante(Estudiante estudiante);	//Guarda un Estudiante CREATE
		
		public Estudiante estudianteXID(int id); //Leer datos de un Estudiante READ
		
		public Estudiante actualizarEstudiante(Estudiante estudiante); //Actualiza datos del estudiante UPDATE
		
		public void eliminarEstudiante(int id);// Elimina el estudiante DELETE
	
}


