
//Método que hereda de la clase Exception y genera los mensajes de error en las excepciones

package abstraccion;


public class MensajeError extends Exception{
    
    //método constructor de mensaje error
    public MensajeError(String mensaje){
        super(mensaje);
    }
}
