
//Subclase Directivo que hereda de la clase Empleado
package abstraccion;


public class Directivo extends Empleado implements Acciones{
    
    //atributos de la clase Directivo 
    private String categoria;

    //Método setter y getter de la variable categoria 
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
   //Métod que implementa de la interfaz Acciones
    public void imprimir(){
        System.out.println("Directivo nombre: " + getNombre()+
                           ", edad: " + getEdad()+
                           ", sueldo bruto: "+ getSueldoBruto() + 
                           ", sueldo neto: " + getSueldoNeto() +
                           ", categoria: " + categoria
                            );
    }
}
