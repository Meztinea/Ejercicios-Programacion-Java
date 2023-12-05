package mx.com.bibliotecameztinea;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private String email;
	private LocalDateTime fechaRegistro;
	private ArrayList<Material> historialPrestamos = new ArrayList<>(); // Registra los libros o historietas que ha solicitado en préstamo
	
	
	public Usuario(String nombre, String email, LocalDateTime fecha) {
		this.nombre = nombre;
		this.email = email;
		this.fechaRegistro = fecha;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFechaRegistro(LocalDateTime fecha) {
		this.fechaRegistro = fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public LocalDateTime getFechaRegistro() {
		return this.fechaRegistro;
	}
	
	// Registra en su historial el préstamo de un libro
	public void registrarPrestamo(Material material) {
		this.historialPrestamos.add(material);
	}
	
	public void mostrarHistorial() {
		System.out.println("El historial del usuario " + this.nombre + " es: ");
		
		for(Material mat: historialPrestamos) {
			System.out.print("Titulo " + ": " + mat.getTitulo() + ", ");
			System.out.print("Autor: " + mat.getAutor() + ", ");
			System.out.print("Editorial: " + mat.getEditorial() + ", ");
			System.out.print("Ejemplares: " + mat.getEjemplaresDisponibles() + "\n");
		}
	}
}
