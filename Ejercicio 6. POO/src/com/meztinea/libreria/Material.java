package com.meztinea.libreria;

public abstract class Material {
	private final String titulo;
	private final String autor;
	private final String editorial;
	private int ejemplaresDisponibles;
	
	public Material(String titulo, String autor, String editorial, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ejemplaresDisponibles = ejemplares;
	}
	
	public Material(String titulo, String autor, String editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	public abstract void prestarEjemplar();
	
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
	
	public void setEjemplaresDisponibles(int ejemplares) {
		this.ejemplaresDisponibles = ejemplares;
	}
}
