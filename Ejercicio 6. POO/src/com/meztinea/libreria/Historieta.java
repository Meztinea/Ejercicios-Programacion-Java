package com.meztinea.libreria;

public class Historieta extends Material {
	
	// Llamando al constructor de la clase padre con 3 par�metros
	public Historieta(String titulo, String autor, String editorial) {
		super(titulo, autor, editorial);	
	}
	
	// Sobrecarga de constructores
	// Llamando al constructor de la clase padre con todos los par�metros
	public Historieta(String titulo, String autor, String editorial, int ejemplares) {
		super(titulo, autor, editorial, ejemplares);
	}
	
	// Definiendo el m�todo heredado de la clase abstracta
	public void prestarEjemplar() {
		if (getEjemplaresDisponibles() > 0) {
			setEjemplaresDisponibles(getEjemplaresDisponibles() - 1);
			System.out.println("Pr�stamo de Historieta exitoso");
		}
		else {
			System.out.println("No hay ejemplares disponibles");
		}
	}
	
	
}
