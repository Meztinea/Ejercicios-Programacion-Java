
//Clase Main
package abstraccion;

public class Abstraccion {

    
    public static void main(String[] args) {
        
        //Objetos Cliente Empleado y Directivo 
        Cliente cliente1 = new Cliente();        
        Empleado empleado1 = new Empleado();
        Directivo directivo1 = new Directivo();
       
        //Ingresando y mostrando los datos del cliente
        try{
            cliente1.setNombre("Jorge Alberto Ramírez");
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        try{
            cliente1.setEdad(45);
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        cliente1.setTelefonoDeContacto(1234567890);
        cliente1.imprimir();
        
        //Ingresando y mostrando los datos del empleado
        try{
            empleado1.setNombre("Yadira Reyes Manitoba");
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        try{
            empleado1.setEdad(0);
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        empleado1.setSueldoBruto(15000);
        empleado1.calcular_salario_neto();
        empleado1.imprimir();
  
        //ingresando y mostrando los datos del directivo
        try{
            directivo1.setNombre("Sandra Gomez Chacon");
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        try{
            directivo1.setEdad(35);
        }catch(MensajeError e){
            System.out.println(e.getMessage());
        }
        
        directivo1.setCategoria("Gerente");
        directivo1.setSueldoBruto(35000);
        directivo1.calcular_salario_neto();
        directivo1.imprimir();
        
    }
}
