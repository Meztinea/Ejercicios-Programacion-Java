package mx.com.bibliotecameztinea;

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
	
	
}
