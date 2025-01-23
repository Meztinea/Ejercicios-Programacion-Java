
//Subclase Empleado hereda de la clase Abstracta Persona
package abstraccion;


public class Empleado extends Persona implements Acciones {
    
    //Atributos de la clase Empleado
    private double sueldoBruto;
    private double sueldoNeto;

    //Métodos setter y getter de cada variable
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }
    
    //Método propio para calcular el salario neto conforme al salario bruto
    public void calcular_salario_neto(){
        
       sueldoNeto = sueldoBruto * 0.8;
    }

    //Método que implementa de la interfaz Acciones
    public void imprimir() {
        System.out.println("Empleado nombre: " + getNombre()+
                           ", edad: " + getEdad()+
                           ", sueldo bruto: "+ sueldoBruto + 
                           ", sueldo neto: " + sueldoNeto
                            );
        
    }
}
