package com.meztinea.libreria;

import java.util.ArrayList;

public class Biblioteca {

	public static ArrayList<Libro> biblioteca = new ArrayList<>();

	
	public static void main(String[] args) {
		
		// Creando objeto usando constructor con parámetros obligatorios
		Libro libro1 = new Libro("Laura Baeza", "Epoca de Cerezos", "Paraíso Perdido");
		libro1.setEjemplaresDisponibles(10);
		
		// Creando objeto usando constructor con todos los parámetros
		Libro libro2 = new Libro("Toda la soledad del centro de la tierra","Luis Jorge Boone", "Alfaguara", 0);
		
		// Prestando libros
		libro1.prestarEjemplar();
		libro2.prestarEjemplar();

		// Agregando libros a la biblioteca
		biblioteca.add(libro1);
		biblioteca.add(libro2);
		
		// Mostrando los libros de la biblioteca
		mostrarLibros();
		
	}
	
	
	public static void mostrarLibros() {
		int contador = 1;
		for(Libro libro: biblioteca) {
			System.out.println("Titulo " + contador + ": " + libro.getTitulo());
			System.out.println("Autor: " + libro.getAutor());
			System.out.println("Editorial: " + libro.getEditorial());
			System.out.println("Ejemplares: " + libro.getEjemplaresDisponibles() + "\n");
			contador++;
		}
	}
}
