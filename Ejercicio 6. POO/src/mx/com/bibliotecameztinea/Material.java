package mx.com.bibliotecameztinea;

public abstract class Material {
	private final String titulo;
	private final String autor;
	private final String editorial;
	private int ejemplaresDisponibles;
	
	public Material(String titulo, String autor, String editorial, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ejemplaresDisponibles = ejemplares;
	}
	
	public Material(String titulo, String autor, String editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.ejemplaresDisponibles = 0;
	}
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getEditorial() {
		return this.editorial;
	}
	
	public int getEjemplaresDisponibles() {
		return this.ejemplaresDisponibles;
	}
	
	public void aumentarEjemplares(int ejemplares) {
		this.ejemplaresDisponibles += ejemplares;
	}
	
	public void disminuirEjemplares(int ejemplares) {
		this.ejemplaresDisponibles -= ejemplares;
	}
	
	public void prestarEjemplar() {
		if (this.getEjemplaresDisponibles() > 0) {
			this.disminuirEjemplares(1);
			System.out.println("Préstamo de Libro exitoso");
		}
		else {
			System.out.println("No hay ejemplares disponibles");
		}
	}
	
	public void devolverEjemplar() {
		this.aumentarEjemplares(1);
	}
}
