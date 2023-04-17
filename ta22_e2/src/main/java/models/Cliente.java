package models;

import java.time.LocalDate;

public class Cliente {

	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private LocalDate fecha;

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return dni;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
