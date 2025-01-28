
//Clase propia que hereda de la clase Exception para gestionar errores

package universidad;


public class MensajeError extends Exception {
    
    //método constructor de mensaje error
    public MensajeError(String mensaje){
        super(mensaje);
    }
    
}
