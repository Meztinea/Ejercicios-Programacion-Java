
//Subclase Cliente hereda de la clase Abstracta Persona
package abstraccion;


public class Cliente extends Persona implements Acciones{

    //Atributos propios de la clase Cliente
    private int telefonoDeContacto;

    //Método setter de la clase
    public void setTelefonoDeContacto(int telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
    
    //Método getter de la clase
    public int getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    //Método que se implementa de la interfaz Acciones
    public void imprimir() {
        System.out.println("Cliente nombre: " + getNombre()+
                           ", edad: " + getEdad()+
                           ", teléfono: "+ telefonoDeContacto + "."
                            );
    }
}
