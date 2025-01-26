
//Superclase 

package viajefast;

import java.util.Scanner;


public class Vehiculo {
    
    //Creando los atributos que comparten las clases que heredan de Venículo
    String marca, modelo;
    int anio, precio, antiguedad;
    
    Scanner entrada= new Scanner (System.in);
    
    //Método que se implementa en cada objeto de tipo Vehiculo o de las clases que heredan de él
    public void antiguedad(){
       
        if(antiguedad>=10){
            System.out.println("El vehículo debe salir de circulación \n");
        }else{
            System.out.println("El vehículo aún puede estar en circulación\n");
        }
        
    }

}
