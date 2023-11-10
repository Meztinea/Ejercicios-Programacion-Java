package com.meztinea.libreria;

public class Libro extends Material {

	
	// Constructor con tres parámetros
	public Libro(String titulo, String autor, String editorial) {
		super(titulo, autor, editorial);
	}
	
	// Sobrecarga de constructores
	// Constructor con todos los parametros 
	public Libro(String titulo, String autor, String editorial, int ejemplares) {
		super(titulo, autor, editorial, ejemplares);
	}
	
	
	// Método para prestar un libro - Disminuye la cantidad de ejemplares
	// Verifica que esxisten libros antes de realizar un préstamo
	public void prestarEjemplar() {
		if (getEjemplaresDisponibles() > 0) {
			setEjemplaresDisponibles(getEjemplaresDisponibles() - 1);
			System.out.println("Préstamo exitoso");
		}
		else {
			System.out.println("No hay ejemplares disponibles");
		}
	}
	
}
