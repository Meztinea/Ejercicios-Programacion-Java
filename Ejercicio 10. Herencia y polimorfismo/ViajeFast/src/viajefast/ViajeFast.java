
//Clase Main
package viajefast;

import java.util.Scanner;

public class ViajeFast {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        //Iniciando solicitud de opción del menú
        do{
            //Mostrando el menu
            System.out.println("Menú de opciones");
            System.out.println("Selecciona el tipo de vehículo");
            System.out.println("1. Compacto");
            System.out.println("2. Sedan");
            System.out.println("3. Camioneta");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            
            //Analizando la opción elegida
            switch(opcion){
                
                case 1: 
                    //Creando objeto del tipo Veniculo y llamando a sus métodos
                    Compacto vehiculo1 =new Compacto();
                    vehiculo1.imprimir();
                    vehiculo1.antiguedad();
                    break;
                    
                case 2:
                    //Creando objeto del tipo Sedan y llamando a sus métodos
                    Sedan vehiculo2 = new Sedan();
                    vehiculo2.imprimir();
                    vehiculo2.antiguedad();
                    break;
                    
                case 3: 
                    //Creando objeto del tipo Camioneta y llamando a sus métodos
                    Camioneta vehiculo3 = new Camioneta();
                    vehiculo3.imprimir();
                    vehiculo3.antiguedad();
                    break;
                    
                case 4:
                    //Saliendo del ciclo del menú
                    System.out.print("Vuelve pronto!");
                    break;
                    
                default:
                    
                    System.out.print("Opción invalida");
                    break;
               
                
            }
            
            
            
            
        }while(opcion!=4);
        
        
        
        
    }
    
}
