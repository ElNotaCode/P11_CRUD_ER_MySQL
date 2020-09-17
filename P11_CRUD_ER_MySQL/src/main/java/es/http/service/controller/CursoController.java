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

import es.http.service.dto.Curso;
import es.http.service.service.CursoServiceImpl;

@RestController
@RequestMapping("/api")
public class CursoController {
	
	@Autowired
	CursoServiceImpl cursoServiceImpl;
	
	@GetMapping("/cursos")
	public List<Curso> listarCcursos(){
		return cursoServiceImpl.listarCursos();
	}
	
	
	@PostMapping("/cursos")
	public Curso salvarCurso(@RequestBody Curso curso) {
		
		return cursoServiceImpl.guardarCurso(curso);
	}
	
	
	@GetMapping("/cursos/{id}")
	public Curso cursoXID(@PathVariable(name="id") int id) {
		
		Curso Curso_xid= new Curso();
		
		Curso_xid=cursoServiceImpl.cursoXID(id);
		
		System.out.println("Curso XID: "+Curso_xid);
		
		return Curso_xid;
	}
	
	@PutMapping("/cursos/{id}")
	public Curso actualizarCurso(@PathVariable(name="id")int id,@RequestBody Curso curso) {
		
		Curso Curso_seleccionado= new Curso();
		Curso Curso_actualizado= new Curso();
		
		Curso_seleccionado= cursoServiceImpl.cursoXID(id);
		
		Curso_seleccionado.setNombre(curso.getNombre());
		Curso_seleccionado.setHoras(curso.getHoras());
		
		Curso_actualizado = cursoServiceImpl.actualizarCurso(Curso_seleccionado);
		
		System.out.println("El Curso actualizado es: "+ Curso_actualizado);
		
		return Curso_actualizado;
	}
	
	@DeleteMapping("/cursos/{id}")
	public void eleiminarCurso(@PathVariable(name="id")int id) {
		cursoServiceImpl.eliminarCurso(id);
	}
	
	
}
