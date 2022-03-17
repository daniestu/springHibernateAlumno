package com.sinensia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity()
@Table(name="alumno")
@DynamicUpdate
public class Alumno implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idalumno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idalumno;

	@Column(name="nombre")
	private String nombre;

	@Column(name="apellidos")
	private String apellidos;

	@Column(name="dni")
	private String dni;

	public Integer getIdalumno() {
		return idalumno;
	}
	
	public void setIdalumno(Integer idalumno) {
		this.idalumno = idalumno;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Alumno() {

	}
	
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}
	
}
