package com.meztinea.libreria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo {

	private final String fecha;
	private final String titulo;
	private final String autor;
	private final String editorial;
	private String usuario;
	
	public Prestamo(Material material, Usuario usuario) {
		LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		this.fecha = fecha.format(formato);
		this.titulo = material.getTitulo();
		this.autor = material.getAutor();
		this.editorial = material.getEditorial();
		this.usuario = usuario.getNombre();
	}
	
	public void mostrarPrestamo() {
		System.out.println(this.fecha + " " + this.usuario + " " + this.titulo);
	}
	
}
