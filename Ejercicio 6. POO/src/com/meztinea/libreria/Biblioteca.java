package com.meztinea.libreria;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Biblioteca {

	public static ArrayList<Material> biblioteca = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		// Creando libro usando constructor con parámetros obligatorios
		Libro libro1 = new Libro("Epoca de Cerezos", "Laura Baeza", "Paraíso Perdido");
		libro1.setEjemplaresDisponibles(10);
		
		// Creando objeto libro usando constructor con todos los parámetros
		Libro libro2 = new Libro("Toda la soledad del centro de la tierra","Luis Jorge Boone", "Alfaguara", 0);

		// Creando historieta - 3 parámetros
		Historieta hist1 = new Historieta("Superman", "Joe Shuster y Jerry Siegel", "ECC Ediciones");
		
		// Creando objeto historieta enviando todos los parámetros
		Historieta hist2 = new Historieta("Batman", "Bob Kane y Bill Finger", "ECC Ediciones", 10);
		
		Historieta hist3 = new Historieta("Spiderman", "Stan Lee y Steve Ditko", "Panini Comics");
		hist3.setEjemplaresDisponibles(5);
		
		
		// Prestando libros e historietas
		libro1.prestarEjemplar();
		libro2.prestarEjemplar();
		hist2.prestarEjemplar();
		hist3.prestarEjemplar();

		// Agregando libros a la biblioteca
		biblioteca.add(libro1);
		biblioteca.add(libro2);
		biblioteca.add(hist1);
		biblioteca.add(hist2);
		biblioteca.add(hist3);
		
		
		// Mostrando los libros de la biblioteca
		mostrarMaterial();
		
		
		// Buscando un material (libro o historieta) en la biblioteca
		buscarMaterial("María");
		buscarMaterial("Batman");
		
		// Creando usuario
		Usuario user1 = new Usuario("Jorge", "miemail@gmail.com", LocalDateTime.now());
		
		
		// Registrando préstamos en historial de usuario
		user1.registrarPrestamo(libro1);
		user1.registrarPrestamo(hist3);
		
		user1.mostrarHistorial();
		
		
		Prestamo prestamo = new Prestamo(hist2, user1);
		
		
		prestamo.mostrarPrestamo();
	}
	
	
	public static void mostrarMaterial() {
		int contador = 1;
		for(Material mat: biblioteca) {
			System.out.println("Titulo " + contador + ": " + mat.getTitulo());
			System.out.println("Autor: " + mat.getAutor());
			System.out.println("Editorial: " + mat.getEditorial());
			System.out.println("Ejemplares: " + mat.getEjemplaresDisponibles() + "\n");
			contador++;
		}
	}
	
	public static void buscarMaterial(String mat) {
		boolean encontrado = false;
		
		for (Material m: biblioteca) { 
			
			if (m.getTitulo().equalsIgnoreCase(mat)) {
				System.out.println("Elemento encontrado");
				System.out.println("Titulo: " + m.getTitulo());
				System.out.println("Autor: " + m.getAutor());
				System.out.println("Editorial: " + m.getEditorial());
				System.out.println("Ejemplares: " + m.getEjemplaresDisponibles() + "\n");
				encontrado = true;
			}
			
		}
		
		if (!encontrado) {
			System.out.println("Elemento no encontrado.");
		}
	}
}
