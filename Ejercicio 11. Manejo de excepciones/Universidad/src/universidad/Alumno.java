
package universidad;

import java.util.Scanner;


public class Alumno {
   
    Scanner entrada = new Scanner (System.in);
    
    //Declarando las variables de la clase Alumno
    protected String nombre, mes;
    protected int dia, anio, materias;
    protected float promedio, calificacion; 

    
    /*Método setter variable nombre de tipo String por medio de un for analiza
     si cada caracter de la variable es alfabetico 
    */
    public void setNombre(String nombre) throws MensajeError {
        
        for (int i = 0; i <nombre.length(); i++){
            
            char letras = nombre.toUpperCase().charAt(i);
            int valorASCII = (int)letras;
            
            if( valorASCII != 32 &&(valorASCII < 65 || valorASCII > 90) ){
                throw new MensajeError("El nombre no es valido");
            }else{
            this.nombre = nombre;
            }
        }
    }
    
    /*Método setter variable mes de tipo String por medio de un for analiza
    si cada caracter de la variable es alfabetico 
    */
    public void setMes(String mes) throws MensajeError {
        
        for (int i = 0; i <mes.length(); i++){
            
            char letras = mes.toUpperCase().charAt(i);
            int valorASCII = (int)letras;
            
            if(valorASCII < 65 || valorASCII > 90){
                throw new MensajeError("El mes no es valido");
            }else{
            this.mes = mes;
             }
        }
    }

    
    /*Método setter variable dia de tipo int analiza si el dia se encuentra entre
    los valores 1 y 31
    */
    public void setDia(int dia) throws MensajeError {
       
            if(dia>=1 && dia<=31){
                    this.dia = dia;
             }else{
                  throw new MensajeError("El día no es valido");
            }
    }
        
        
    /*Método setter variable anio de tipo int analiza si el año se es menor a
    100, solicita el año en dos digitos
    */
    public void setAnio(int anio) throws MensajeError {
        
        if(anio<100){
            this.anio = anio;
        }else{
            throw new MensajeError("El año no es valido");
        }
    }

    
    /*Método setter variable promedio de tipo float, recibe una cantidad de materias
    por medio de un for recibe las calificaciones y guarda el valor en la variable
    promedio, las materias deben ser mayores a 1 y las calificaciones entre 0 y 10.
    */
    public void setPromedio(float materias) throws MensajeError {
        
        if(materias>=1){
           for(int i = 1; i<=materias; i++){
            
            System.out.print("Ingresa la calificación: ");
            calificacion = entrada.nextFloat();
            
            if(calificacion>=0 && calificacion<=10){
                promedio = promedio + calificacion;
            }else{
                throw new MensajeError ("La calificación no es valida");
            }
            } 
           
           
        }else{
            throw new MensajeError("La cantidad de materias no es valida");
        }
        
        this.promedio = promedio/materias;
        
    }

    
    /*Métodos getter para todas las variables, devuelven el valor almacenado 
    en cada una de ellas
    */      
    public String getNombre() {
        return nombre;
    }

    public String getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAnio() {
        return anio;
    }

    public float getPromedio() {
        return promedio;
    }
    
}
