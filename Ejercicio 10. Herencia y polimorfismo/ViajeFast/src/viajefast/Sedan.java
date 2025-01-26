//Clase hija de Vehiculo

package viajefast;


public class Sedan extends Vehiculo {
    
    //Atributos propios de la clase Sedan
    String descapotable;
    
    //Método que aplica el polimorfismo
    public void imprimir(){
       
        //Solicitando los datos y guardandolos en las variables que hereda esta clase
        System.out.print("Ingresa la marca: ");
        marca = entrada.nextLine();
        System.out.print("Ingresa el modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Descapotable? ");
        descapotable = entrada.nextLine();
        System.out.print("Ingresa el año: ");
        anio = entrada.nextInt();
        System.out.print("Ingresa el precio: ");
        precio = entrada.nextInt();
        
        //Calculando la antiguedad
        antiguedad = 2021 - anio;
        
        System.out.print("El vehículo " + marca + " " + modelo + " que " + descapotable + " es descapotable");
        System.out.println(". Con precio de " + precio + " tiene una antigüedad de " + antiguedad + " años");
        
    }
}
