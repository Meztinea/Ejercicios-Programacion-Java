package com.meztinea.libreria;

public class Libro {

	private String titulo;
	private String autor;
	private String editorial;
	private int ejemplaresDisponibles;
	
	// Constructor vacío por defecto
	public Libro() {
		
	}
	
	// Constructor con todos los parametros 
	public Libro(String titulo, String autor, String editorial, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ejemplaresDisponibles = ejemplares;
	}
	
	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public void setEjemplaresDisponibles(int ejemplares) {
		this.ejemplaresDisponibles = ejemplares;
	}
	
	// Getters
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getEditorial() {
		return this.editorial;
	}
	
	public int getEjemplaresDisponibles() {
		return this.ejemplaresDisponibles;
	}
	
	// Método para prestar un libro - Disminuye la cantidad de ejemplares
	public void prestarLibro() {
		this.ejemplaresDisponibles--;
	}
	
}
