//Clase hija de Vehiculo

package viajefast;


public class Camioneta extends Vehiculo {
    
    //Atributos propios de la clase Sedan
    int capacidadPasajeros;
    String traccion;
    
    //Método que aplica el polimorfismo
    public void imprimir(){
       
        //Solicitando los datos y guardandolos en las variables que hereda esta clase
        System.out.print("Ingresa la marca: ");
        marca = entrada.nextLine();
        System.out.print("Ingresa el modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Ingresa tipo de tracción: ");
        traccion = entrada.nextLine();
        System.out.print("Ingresa la capacidad de pasajeros: ");
        capacidadPasajeros = entrada.nextInt();
        System.out.print("Ingresa el año: ");
        anio = entrada.nextInt();
        System.out.print("Ingresa el precio: ");
        precio = entrada.nextInt();
        
        //Calculando la antiguedad
        antiguedad = 2021 - anio;
        
        System.out.print("El vehículo " + marca + " " + modelo + " para " + capacidadPasajeros + " pasajeros");
        System.out.println(" con tipo de tracción " + traccion);
        System.out.println("Con precio de " + precio + " tiene una antigüedad de " + antiguedad + " años");
        
    }
   
    
    
    
    
}
