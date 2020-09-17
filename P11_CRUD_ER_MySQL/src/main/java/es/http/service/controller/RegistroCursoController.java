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

import es.http.service.dto.RegistroCurso;
import es.http.service.service.RegistroCursoServiceImpl;

@RestController
@RequestMapping("/api")
public class RegistroCursoController {
	
	@Autowired
	RegistroCursoServiceImpl registroCursoServiceImpl;
	
	@GetMapping("/registroCursos")
	public List<RegistroCurso> listarRegistroCurso(){
		return registroCursoServiceImpl.listarRegistroCurso();
	}
	
	
	@PostMapping("/registroCursos")
	public RegistroCurso salvarRegistroCurso(@RequestBody RegistroCurso registroCurso) {
		
		return registroCursoServiceImpl.guardarRegistroCurso(registroCurso);
	}
	
	
	@GetMapping("/registroCursos/{id}")
	public RegistroCurso RegistroCursoXID(@PathVariable(name="id") int id) {
		
		RegistroCurso RegistroCurso_xid= new RegistroCurso();
		
		RegistroCurso_xid=registroCursoServiceImpl.registroCursoXID(id);
		
		System.out.println("RegistroCurso XID: "+RegistroCurso_xid);
		
		return RegistroCurso_xid;
	}
	
	@PutMapping("/registroCursos/{id}")
	public RegistroCurso actualizarRegistroCurso(@PathVariable(name="id")int id,@RequestBody RegistroCurso RegistroCurso) {
		
		RegistroCurso RegistroCurso_seleccionado= new RegistroCurso();
		RegistroCurso RegistroCurso_actualizado= new RegistroCurso();
		
		RegistroCurso_seleccionado= registroCursoServiceImpl.registroCursoXID(id);
		
		
		RegistroCurso_seleccionado.setCurso(RegistroCurso.getCurso());
		RegistroCurso_seleccionado.setEstudiante(RegistroCurso.getEstudiante());
		RegistroCurso_seleccionado.setRegisteredAt(RegistroCurso.getRegisteredAt());
		RegistroCurso_seleccionado.setGrade(RegistroCurso.getGrade());
		
		RegistroCurso_actualizado = registroCursoServiceImpl.actualizarRegistroCurso(RegistroCurso_seleccionado);
		
		System.out.println("El RegistroCurso actualizado es: "+ RegistroCurso_actualizado);
		
		return RegistroCurso_actualizado;
	}
	
	@DeleteMapping("/registroCursos/{id}")
	public void eleiminarRegistroCurso(@PathVariable(name="id")int id) {
		registroCursoServiceImpl.eliminarRegistroCurso(id);
	}
	
	
}
