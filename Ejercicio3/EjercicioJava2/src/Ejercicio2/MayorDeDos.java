package Ejercicio2;

public class MayorDeDos {

	/*
	 * Encontrar el mayor de dos números 
	 */
	public static void main(String[] args) {

		int a = 11;
		int b = 7;
		
		System.out.println("El mayor es: " + buscarMayor(a, b));
		
	}
	
	public static int buscarMayor(int a, int b) {
		
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}

}
