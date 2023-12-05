package mx.com.bibliotecameztinea;

import java.time.LocalDateTime;

public class Pruebas {

	public static void main(String[] args) {
		
		// Creando libro usando constructor con parámetros obligatorios
		Libro libro1 = new Libro("Epoca de Cerezos", "Laura Baeza", "Paraíso Perdido");
		libro1.aumentarEjemplares(10);
		
		// Creando objeto libro usando constructor con todos los parámetros
		Libro libro2 = new Libro("Toda la soledad del centro de la tierra","Luis Jorge Boone", "Alfaguara", 0);

		// Creando historieta - 3 parámetros
		Historieta hist1 = new Historieta("Superman", "Joe Shuster y Jerry Siegel", "ECC Ediciones");
		
		// Creando objeto historieta enviando todos los parámetros
		Historieta hist2 = new Historieta("Batman", "Bob Kane y Bill Finger", "ECC Ediciones", 10);
		
		Historieta hist3 = new Historieta("Spiderman", "Stan Lee y Steve Ditko", "Panini Comics");
		hist3.aumentarEjemplares(5);
		

		
		// Prestando libros e historietas
		libro1.prestarEjemplar();
		libro2.prestarEjemplar();
		hist2.prestarEjemplar();
		hist3.prestarEjemplar();

		// Agregando libros a la biblioteca
		Biblioteca.inventario.add(libro1);
		Biblioteca.inventario.add(libro2);
		Biblioteca.inventario.add(hist1);
		Biblioteca.inventario.add(hist2);
		Biblioteca.inventario.add(hist3);
		
		
		// Mostrando los libros de la biblioteca
		Biblioteca.mostrarMaterial();
		
		
		// Buscando un material (libro o historieta) en la biblioteca
		Biblioteca.buscarMaterial("María");
		Biblioteca.buscarMaterial("Batman");
		
		// Creando usuario
		Usuario user1 = new Usuario("Jorge", "miemail@gmail.com", LocalDateTime.now());
		
		
		// Registrando préstamos en historial de usuario
		user1.registrarPrestamo(libro1);
		user1.registrarPrestamo(hist3);
		
		user1.mostrarHistorial();
		
		
		Prestamo prestamo = new Prestamo(hist2, user1);
		
		
		prestamo.mostrarPrestamo();

	}

}
