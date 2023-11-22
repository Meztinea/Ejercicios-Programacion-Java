package com.meztinea.libreria;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private String email;
	private LocalDateTime fechaRegistro;
	private ArrayList<Material> historialPrestamos = new ArrayList<>(); // Registra los libros o historietas que ha solicitado en préstamo
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFechaRegistro(LocalDateTime fecha) {
		this.fechaRegistro = fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public LocalDateTime getFechaRegistro() {
		return this.fechaRegistro;
	}
	
	// Registra en su historial el préstamo de un libro
	public void registrarPrestamo(Material material) {
		this.historialPrestamos.add(material);
	}
}
