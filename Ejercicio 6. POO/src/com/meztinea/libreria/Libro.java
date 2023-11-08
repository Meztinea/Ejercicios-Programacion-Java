package com.meztinea.libreria;

public class Libro {

	private final String titulo;
	private final String autor;
	private final String editorial;
	private int ejemplaresDisponibles;
	
	// Constructor con tres par�metros
	public Libro(String titulo, String autor, String editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	// Sobrecarga de constructores
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
	
	// M�todo para prestar un libro - Disminuye la cantidad de ejemplares
	// Verifica que esxisten libros antes de realizar un pr�stamo
	public void prestarLibro() {
		if (this.ejemplaresDisponibles > 0) {
			this.ejemplaresDisponibles--;
			System.out.println("Pr�stamo exitoso");
		}
		else {
			System.out.println("No hay ejemplares disponibles");
		}
	}
	
}