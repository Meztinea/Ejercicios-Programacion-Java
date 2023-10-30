package com.meztinea.libreria;

import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Biblioteca> biblioteca = new ArrayList<>();

	
	public static void main(String[] args) {
		
		// Creando objeto usando constructor vacío o por defecto
		Libro libro1 = new Libro();
		libro1.setAutor("Laura Baeza");
		libro1.setTitulo("Época de Cerezos");
		libro1.setEditorial("Paraíso Perdido");
		libro1.setEjemplaresDisponibles(10);
		
		// Creando objeto usando constructor con parámetros
		Libro libro2 = new Libro("Toda la soledad del centro de la tierra","Luis Jorge Boone", "Alfaguara", 12);
		
		// Prestando libros
		try {
			libro1.prestarLibro();
		} catch (Exception e) {
			System.out.println("No hay libros disponibles");
		}
		
		try {
			libro2.prestarLibro();
		} catch (Exception e) {
			System.out.println("No hay libros disponibles");
		}
		
		
		System.out.println(libro1.getTitulo() + " cuenta con " + libro1.getEjemplaresDisponibles() + " ejemplares disponibles");
		System.out.println(libro2.getTitulo() + " cuenta con " + libro2.getEjemplaresDisponibles() + " ejemplares disponibles");
	}             
}
