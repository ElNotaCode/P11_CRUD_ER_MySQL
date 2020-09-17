package es.http.service.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="registro_curso")//en caso que la tabala sea diferente
public class RegistroCurso {

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "student_id")
    Estudiante estudiante;
 
    @ManyToOne
    @JoinColumn(name = "course_id")
    Curso curso;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registeredAt;
	
	@Column(name = "grade")//no hace falta si se llama igual
	private int grade;
	
	//Constructores
	
	public RegistroCurso() {
	
	}

	public RegistroCurso(int id, Estudiante estudiante, Curso curso, Date registeredAt, int grade) {
		this.id = id;
		this.estudiante = estudiante;
		this.curso = curso;
		this.registeredAt = registeredAt;
		this.grade = grade;
	}


	//Getters y Setters
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
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}


	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	/**
	 * @return the registeredAt
	 */
	public Date getRegisteredAt() {
		return registeredAt;
	}


	/**
	 * @param registeredAt the registeredAt to set
	 */
	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}


	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}


	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "RegistroCurso [id=" + id + ", estudiante=" + estudiante + ", curso=" + curso + ", registeredAt="
				+ registeredAt + ", grade=" + grade + "]";
	}

	
	
	
	
	




		
	
	
	
}
