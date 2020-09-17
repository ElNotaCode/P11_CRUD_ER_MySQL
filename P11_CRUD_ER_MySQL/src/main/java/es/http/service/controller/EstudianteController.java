package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Estudiante;
import es.http.service.service.EstudianteServiceImpl;

@RestController
@RequestMapping("/api")
public class EstudianteController {
	
	@Autowired
	EstudianteServiceImpl estudianteServiceImpl;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> listarCcursos(){
		return estudianteServiceImpl.listarEstudiantes();
	}
	
	
	@PostMapping("/estudiantes")
	public Estudiante salvarEstudiante(@RequestBody Estudiante curso) {
		
		return estudianteServiceImpl.guardarEstudiante(curso);
	}
	
	
	@GetMapping("/estudiantes/{id}")
	public Estudiante EstudianteXID(@PathVariable(name="id") int id) {
		
		Estudiante Estudiante_xid= new Estudiante();
		
		Estudiante_xid=estudianteServiceImpl.estudianteXID(id);
		
		System.out.println("Estudiante XID: "+Estudiante_xid);
		
		return Estudiante_xid;
	}
	
	@PutMapping("/estudiante/{id}")
	public Estudiante actualizarEstudiante(@PathVariable(name="id")int id,@RequestBody Estudiante Estudiante) {
		
		Estudiante Estudiante_seleccionado= new Estudiante();
		Estudiante Estudiante_actualizado= new Estudiante();
		
		Estudiante_seleccionado= estudianteServiceImpl.estudianteXID(id);
		
		Estudiante_seleccionado.setNombre(Estudiante.getNombre());
		Estudiante_seleccionado.setApellido(Estudiante.getApellido());
		Estudiante_seleccionado.setTelefono(Estudiante.getTelefono());
		
		Estudiante_actualizado = estudianteServiceImpl.actualizarEstudiante(Estudiante_seleccionado);
		
		System.out.println("El Estudiante actualizado es: "+ Estudiante_actualizado);
		
		return Estudiante_actualizado;
	}
	
	@DeleteMapping("/estudiante/{id}")
	public void eleiminarEstudiante(@PathVariable(name="id")int id) {
		estudianteServiceImpl.eliminarEstudiante(id);
	}
	
	
}
