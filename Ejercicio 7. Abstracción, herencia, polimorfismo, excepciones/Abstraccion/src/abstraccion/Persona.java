
//Superclase Abstracta 
package abstraccion;

//Se identifica la clase abstracta por la palabra reservada abstract
public abstract class Persona {
 
    /*Atributos privados que hereda a las subclases
    */
    private String nombre;
    private int edad;

    /*Procesando la entrada y excepción de la variable Nombre 
    El método analiza la variable de entrada, comienza con un for que recorre
    cada uno de los caracteres de la variable (convirtiendo de un String a un
    Char). Por medio de los valores ASCII analiza si se encuentra dentro del 
    rango establecido (rango de letras, incluyendo el espacio en blanco), si 
    no se encuentra dentro de este rango se imprime el mensaje de error establecido
    Si se encuentra dentro del rango se establece que el nombre ingresado se guarda 
    en la variable privada en la case. 
    */
    public  void setNombre(String nombre) throws MensajeError{
        
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

    /*Procesando la entrada y excepción de la variable Edad
    Analiza si la variable edad se encuentra dentro del rango establecido 
    de 1 a 100. si no se encuentra dentro del rango, lanza el mensaje de erro.
    Si se encuentra dentro del rango se guarda la variable ingresada en la variable
    privada edad. 
    */
    public void setEdad(int edad) throws MensajeError{
        
        if(edad>=1 && edad<=100){
                    this.edad = edad;
             }else{
                  throw new MensajeError("La edad no es valida");
            }
    }
    
    //Métodos getter para acceder a estas variables desde otras clases
    public  String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    
    //Método abstracto de la clase abstracta 
    public abstract void imprimir();
    
    
}