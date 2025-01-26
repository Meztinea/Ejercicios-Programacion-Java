/*
Programa que calcula:
*Si un número es capicua
*Si un número es primo
*El cuadrado del número

Autor: María Raquel Martínez Urrutia ES202107345
 */
package capicua;
import java.util.Scanner;


public class AnalizadorCapicua {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declarando variables
        int opcion = 0;
        int numero = 0;
        
        
        //Iniciando el ciclo de opciones de menú
        do {
            
            
        //Mostrando el Menú
        System.out.println("\nMenú");
        System.out.println("1. Registrar número");
        System.out.println("2. Es capicua");
        System.out.println("3. Es primo");
        System.out.println("4. Elevado al cuadarado su producto es: ");
        System.out.println("5. Salir");
        System.out.println();

        
        //Solicitando una opción del menú
        System.out.print("Elige una opción del menú: ");
        
        opcion = entrada.nextInt();
            
         
            
            //Iniciando la ejecución del menú
            switch (opcion){
              
                
                //Ingresando el número
                case 1: System.out.print("Ingresa el número: ");
                        numero = entrada.nextInt();
                        
                        break;        
                        
                        
                //Llamando al método numeroCapicua
                case 2: numeroCapicua(numero);
                        
                        if(numeroCapicua(numero) == true){
                            System.out.println("Es capicúa");
                        }
                        else{
                            System.out.println("No es capicúa");
                        }
                        
                        break;
                        
                        
                //Llamando al método numeroPrimo        
                case 3: numeroPrimo(numero);
                
                        if(numeroPrimo(numero)==true){
                             System.out.println("El número es primo");
                        }else{
                             System.out.println("No es primo");
                        }

                         break;    
                         
                         
                //Llamando al método numeroCuadrado         
                case 4: numeroCuadrado(numero);
                
                        System.out.println("Elevado al cuadrado su producto es: "+ numeroCuadrado(numero));
                        
                         break;
                         
                //Saliendo del programa        
                case 5: System.out.println("Saliste del programa");
                        break;  
                
                        
                //Advertencia Opción Incorrecta
                default: System.out.println("Opción incorrecta");
                        break;
                
            }
            
         
        }while(opcion!=5); 
        
        
        
    }
    
    //Método para analizar si el número es CAPICUA
    public static boolean numeroCapicua(int numero){
        
        String caracteres = String.valueOf(numero);
        
        for(int i = 0, j = caracteres.length()-1; i <= j; i++,--j) {
            if(caracteres.charAt(j) != caracteres.charAt(i)){
                return false;
                
            }
    
        }
        
        return true;
        
    }
    
    
    //Método para saber si el número es Primo
    public static boolean numeroPrimo(int numero){
        boolean resultado = false;  
        int divisores = 0;
        for(int i = 1; i <= numero; i++){
            
            if(numero%i==0){
            divisores++;
            }
        
        }
        if(divisores == 2){
           resultado = true;
        }
        return resultado;
        
    }      

    //Método para calcular el producto del cuadrado del número
    public static int numeroCuadrado(int numero){
        
        int resultado;
        
        resultado = (int) Math.pow(numero,2);
        
        return resultado;
        
    }
}
