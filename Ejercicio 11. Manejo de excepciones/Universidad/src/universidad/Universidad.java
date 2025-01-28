
//Clase Main

package universidad;

import java.util.Scanner;


public class Universidad {

    
    public static void main(String[] args) throws MensajeError {
    
        Scanner entrada = new Scanner(System.in);
        //creando instancia de Alumno
        Alumno alumno1 = new Alumno();
        
        
        //try - catch de nombre completo
        System.out.print("Introduce el nombre completo: ");
        try{
            alumno1.setNombre(entrada.nextLine());
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        
        //try - catch de día nacimiento
         System.out.print("Introduce el día de nacimiento: ");
        try{
            alumno1.setDia(entrada.nextInt());
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        entrada.nextLine();
        
        //try - catch mes nacimiento
        System.out.print("Introduce el mes de nacimiento: ");
        try{
            alumno1.setMes(entrada.nextLine());
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        
        //try - catch año nacimiento
        System.out.print("Introduce el año de nacimiento a dos digitos: ");
        try{
            alumno1.setAnio(entrada.nextInt());
           
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        
        //try - catch promedio
        System.out.print("Introduce la cantidad de materias: ");
        try{
            alumno1.setPromedio(entrada.nextInt());
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        //Solicitando los datos almacenados por medio de los getters
        System.out.println("Alumno: " +alumno1.getNombre());
        System.out.println("Fecha de nacimiento: " + alumno1.getDia() + "/" + alumno1.getMes() + "/" + alumno1.getAnio() );
        System.out.println("Promedio: " + alumno1.getPromedio());
        
        
    }
    
}
