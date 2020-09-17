package es.http.service.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="curso")//en caso que la tabala sea diferente
public class Curso {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "horas")//no hace falta si se llama igual
	private int horas;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<RegistroCurso> registroCurso;
	
	//Constructores
	
	public Curso() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param registroCurso
	 */
	public Curso(int id, String nombre, int horas, List<RegistroCurso> registroCurso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.registroCurso = registroCurso;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @return the registroCurso
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RegistroCurso")
	public List<RegistroCurso> getRegistroCurso() {
		return registroCurso;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setRegistroCurso(List<RegistroCurso> registroCurso) {
		this.registroCurso = registroCurso;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}


	
	
	
}
