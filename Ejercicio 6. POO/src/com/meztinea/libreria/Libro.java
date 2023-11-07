package com.meztinea.libreria;

public class Libro {

	private final String titulo;
	private final String autor;
	private final String editorial;
	private int ejemplaresDisponibles;
	
	// Constructor con tres parámetros
	public Libro(String titulo, String autor, String editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	// Constructor con todos los parametros 
	public Libro(String titulo, String autor, String editorial, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ejemplaresDisponibles = ejemplares;
	}
	
	// Setters
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
