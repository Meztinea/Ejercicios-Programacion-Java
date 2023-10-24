package Ejercicio;

import java.util.Scanner;
/*
    Determinar si un número es primo en Java
    
    Un número primo se identifica por ser divisible entre él y el número 1. 
    El residuo al dividirlo entre él será 0 y al divirlo entre 1 será 0.
    Al dividirlo entre otros números el residuo es un tipo decimal. 
*/

public class EsPrimo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero (mayor a 2): ");
        int numero = in.nextInt();
        
        System.out.println(esPrimo(numero));
        
        
    }
    
    // Comprobando si el número es primo
    public static String esPrimo(int numero) {
        boolean esPrimo = true;
        
        for (int i=2; i<numero; i++) {
            if ((numero%i) == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            return "El número es primo.";
        }
        else {
            return "El número no es primo";
        }
    }
    
}
