package com.meztinea.libreria;

public class Historieta extends Material {
	
	// Llamando al constructor de la clase padre con 3 parámetros
	public Historieta(String titulo, String autor, String editorial) {
		super(titulo, autor, editorial);	
	}
	
	// Sobrecarga de constructores
	// Llamando al constructor de la clase padre con todos los parámetros
	public Historieta(String titulo, String autor, String editorial, int ejemplares) {
		super(titulo, autor, editorial, ejemplares);
	}
	
	// Definiendo el método heredado de la clase abstracta
	public void prestarEjemplar() {
		if (getEjemplaresDisponibles() > 0) {
			setEjemplaresDisponibles(getEjemplaresDisponibles() - 1);
			System.out.println("Préstamo de Historieta exitoso");
		}
		else {
			System.out.println("No hay ejemplares disponibles");
		}
	}
	
	
}
