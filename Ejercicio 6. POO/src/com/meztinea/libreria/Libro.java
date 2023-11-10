package com.meztinea.libreria;

public class Libro extends Material {

	
	// Constructor con tres par�metros
	public Libro(String titulo, String autor, String editorial) {
		super(titulo, autor, editorial);
	}
	
	// Sobrecarga de constructores
	// Constructor con todos los parametros 
	public Libro(String titulo, String autor, String editorial, int ejemplares) {
		super(titulo, autor, editorial, ejemplares);
	}
	
	
	// M�todo para prestar un libro - Disminuye la cantidad de ejemplares
	// Verifica que esxisten libros antes de realizar un pr�stamo
	public void prestarEjemplar() {
		if (getEjemplaresDisponibles() > 0) {
			setEjemplaresDisponibles(getEjemplaresDisponibles() - 1);
			System.out.println("Pr�stamo exitoso");
		}
		else {
			System.out.println("No hay ejemplares disponibles");
		}
	}
	
}
