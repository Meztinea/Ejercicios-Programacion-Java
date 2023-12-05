package mx.com.bibliotecameztinea;

import java.util.ArrayList;

public class Biblioteca {

	public static ArrayList<Material> inventario = new ArrayList<>();
	
	
	public static void mostrarMaterial() {
		int contador = 1;
		for(Material mat: inventario) {
			System.out.println("Titulo " + contador + ": " + mat.getTitulo());
			System.out.println("Autor: " + mat.getAutor());
			System.out.println("Editorial: " + mat.getEditorial());
			System.out.println("Ejemplares: " + mat.getEjemplaresDisponibles() + "\n");
			contador++;
		}
	}
	
	public static void buscarMaterial(String mat) {
		boolean encontrado = false;
		
		for (Material m: inventario) { 
			
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
