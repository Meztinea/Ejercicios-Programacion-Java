package mx.com.bibliotecameztinea;

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
	
	
}
