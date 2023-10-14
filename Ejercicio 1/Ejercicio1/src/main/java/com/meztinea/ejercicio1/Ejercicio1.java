package com.meztinea.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio1 {

    public static ArrayList<Double> calificaciones = new ArrayList<>();
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion = 0;
        
        do {
            System.out.println("Menú de ocpiones");
            System.out.println("1. Ingresar calificaciones");
            System.out.println("2. Imprimir todas las calificaciones");
            System.out.println("3. Calcular promedio de calificaciones");
            System.out.println("4. Nota más alta");
            System.out.println("5. Nota más baja");
            System.out.println("6. Notas por encima del promedio");
            System.out.println("7. Notas por debajo del promedio");
            System.out.println("8. Notas por encima de un valor x");
            System.out.println("9. Eliminar todas las calificaciones");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    ingresarCalificaciones();
                    break;
                case 2:
                    imprimirCalificaciones();
                    break;
                case 3:
                    calcularPromedio();
                    break;
                case 4:
                    calcularNotaAlta();
                    break;
                case 5:
                    calcularNotaBaja();
                    break;
                case 6:
                    calcularPorEncimaPromedio();
                    break;
                case 7:
                    calcularPorDebajoPromedio();
                    break;
                case 8:
                    calcularPorEncimaX();
                    break;
                case 9:
                    eliminarCalificaciones();
                    break;
                case 10:
                    System.out.println("Saliste del programa");
                    break;
            }
        } while (opcion != 10);
    }
    
    
    static void calcularPorEncimaX() {
        System.out.print("\nIngresa un valor para calcular las notas por encima: ");
        double valorX = teclado.nextDouble();
        int notasEncimaValorX = 0;
        
        for (double calificacion: calificaciones) {
            if (calificacion > valorX) {
                notasEncimaValorX++;
            }
        }
        System.out.println("\nLa cantidad de notas por encima del valor son: " + 
                notasEncimaValorX);
        System.out.println("");
    }
    
    
    static void calcularPorDebajoPromedio() {
        // Obtener el promedio
        double promedio = calcularPromedio();
        int notasDebajoPromedio = 0;
        
        for (double calificacion: calificaciones) {
            if (calificacion < promedio) {
                notasDebajoPromedio++;
            }
        }
        System.out.println("\nLa cantidad de notas por debajo del promedio son: " + 
                notasDebajoPromedio);
        System.out.println("");
    }
    
    
    static void calcularPorEncimaPromedio() {
        // Obtener el promedio 
        double promedio = calcularPromedio();
        int notasEncimaPromedio = 0;
        
        for (double calificacion: calificaciones) {
            if (calificacion > promedio) {
                notasEncimaPromedio++;
            }
        }
        System.out.println("\nLa cantidad de notas por encima del promedio son: " + 
                notasEncimaPromedio);
        System.out.println("");
    }
    
    
    static void calcularNotaBaja() {
        // Ordenar los datos en la lista
        Collections.sort(calificaciones);
        
        // Obtener el dato más pequeño
        double notaBaja = calificaciones.get(0);
        System.out.println("\nLa nota más baja es: " + notaBaja);
        System.out.println("");
    }
    
    
    static void calcularNotaAlta() {
        // Ordenar los datos en la lista
        Collections.sort(calificaciones);
        
        // Obtener el dato más grande
        double notaAlta = calificaciones.get(calificaciones.size() - 1);
        System.out.println("\nLa nota más alta es: " + notaAlta);
        System.out.println("");
    }
    
    
    static double calcularPromedio(){
        // Conocer la cantidad de calificaciones en la lista
        double numCalificaciones = calificaciones.size();
        double sumaCalificaciones = 0;
        // Realizar la suma de todos los elementos de la lista
        for (double calificacion: calificaciones) {
            sumaCalificaciones += calificacion;
        }
        double promedio = sumaCalificaciones / numCalificaciones;
        System.out.println("\nEl promedio de las calificaciones es: " + promedio);
        System.out.println("");
        return promedio;
    }
    
    
    static void eliminarCalificaciones(){
        calificaciones.clear();
        System.out.println("");
    }
    
    
    public static void ingresarCalificaciones(){
        boolean seguir = true;
        
        do {
            System.out.print("\nIngresa la calificación (0-10): ");
            double calificacion = teclado.nextDouble();
            teclado.nextLine();
            
            if (calificacion >= 0 && calificacion <= 10) {
                calificaciones.add(calificacion);
            }
            else {
                System.out.println("Calificación fuera del rango establecido (0-10)");
                continue;
            }
            
            System.out.print("\nQuieres ingresar más calificaciones? (s/S - n/N)  ");
            String respuesta = teclado.nextLine();
            System.out.println("");
            
            if(respuesta.equalsIgnoreCase("n")){
                seguir = false;
            }
            
        } while (seguir);
    }
    
    
    public static void imprimirCalificaciones() {
        
        if(calificaciones.isEmpty()) {
            System.out.println("\nLa lista de calificaciones está vacía.");
            System.out.println("");
        }
        else {
            int numeroCalificacion = 1;
            System.out.println("");
        
            for (double x: calificaciones) {
                System.out.println("Calificacion #" + numeroCalificacion + "    " + x);
                numeroCalificacion++;
            }
            System.out.println("");
        }   
    }
}
