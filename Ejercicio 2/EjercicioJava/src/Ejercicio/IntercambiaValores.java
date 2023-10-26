package Ejercicio;

public class IntercambiaValores {

	/*
	 * Realizar un programa que permita el intercambio de valores
	 * entre dos variables. Mostrar el resultado en pantalla. 
	 */
	public static void main(String[] args) {

		int a = 5;
		int b = 14;
		int c;
		
		System.out.println("Valores antes del intercambio: a= " + a + " b= " + b );
		
		// Intercambiando valores
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores despues del intercambio: a= " + a + " b= " + b );
	}
}
