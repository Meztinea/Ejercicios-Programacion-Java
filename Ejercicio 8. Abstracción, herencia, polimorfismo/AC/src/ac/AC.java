//Clase Main donde se implementan los métodos

package ac;


import java.util.Scanner;

public class AC {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        //Se solicita al usuario indicar si desea registrar a docente o administrativo
        System.out.println("Bienvenido\n1. Agregar docente\n2. Agregar administrativo");
        int opcion = entrada.nextInt();entrada.nextLine();
        
        
        if(opcion==1){
            
            //Creando objeto docente
            Docente docente1 = new Docente();
            
            
            //Ingresando los datos del docente
            System.out.println("Ingresa el número del docente: ");
            docente1.setNoEmpleado(entrada.nextInt());entrada.nextLine();
            System.out.println("Ingresa los nombres: ");
            docente1.setNombre(entrada.nextLine());
            System.out.println("Ingresa el apellido paterno: ");
            docente1.setApellidoPaterno(entrada.nextLine());
            System.out.println("Ingresa el apellido materno");
            docente1.setApellidoMaterno(entrada.nextLine());
            System.out.println("Introduzca la fecha de nacimiento dd/mm/yyyy: ");
            docente1.setFechaNacimiento(entrada.nextLine());
            System.out.println("Introduzca la fecha de ingreso dd/mm/yyyy: ");
            docente1.setFechaIngreso(entrada.nextLine());
            System.out.println("Ingresa el sueldo base: ");
            docente1.setSueldoBase(entrada.nextDouble());
            System.out.println("Ingresa el monto de la beca: ");
            docente1.setMontoBecaAcademica(entrada.nextDouble());
            
            
            
            //Imprimiendo los datos del docente por medio del método mostrar datos e ingresando los parámetros necesarios para el implementar el método
            docente1.mostrarDatos(docente1.getNoEmpleado(), docente1.getNombre(), docente1.getApellidoPaterno(), docente1.getApellidoMaterno(),
                    docente1.getFechaNacimiento(), docente1.getFechaIngreso(), docente1.getSueldoBase(), docente1.getMontoBecaAcademica(),
                    docente1.calcularImpuestos(docente1.getSueldoBase(), docente1.getMontoBecaAcademica()), 
                    docente1.calcularPagoNeto(docente1.getSueldoBase(), docente1.getMontoBecaAcademica(), docente1.calcularImpuestos(docente1.getSueldoBase(), docente1.getMontoBecaAcademica())));
            
            
            
            
        }else if(opcion==2){
            
            //Creando el objeto Administrativo
            Administrativo admin1 = new Administrativo();
            
             //Ingresando los datos del Administrativo
            System.out.println("Ingresa el número del administrativo: ");
            admin1.setNoEmpleado(entrada.nextInt());entrada.nextLine();
            System.out.println("Ingresa los nombres: ");
            admin1.setNombre(entrada.nextLine());
            System.out.println("Ingresa el apellido paterno: ");
            admin1.setApellidoPaterno(entrada.nextLine());
            System.out.println("Ingresa el apellido materno");
            admin1.setApellidoMaterno(entrada.nextLine());
            System.out.println("Introduzca la fecha de nacimiento dd/mm/yyyy: ");
            admin1.setFechaNacimiento(entrada.nextLine());
            System.out.println("Introduzca la fecha de ingreso dd/mm/yyyy: ");
            admin1.setFechaIngreso(entrada.nextLine());
            System.out.println("Ingresa el sueldo base: ");
            admin1.setSueldoBase(entrada.nextDouble());
            System.out.println("Ingresa el monto de los vales de despensa: ");
            admin1.setMontoValesDespensa(entrada.nextDouble());
            
            
            //Imprimiendo los datos del administrativo por medio del método mostrar datos e ingresando los parámetros necesarios para el implementar el método
            admin1.mostrarDatos(admin1.getNoEmpleado(), admin1.getNombre(), admin1.getApellidoPaterno(), admin1.getApellidoMaterno(),
                    admin1.getFechaNacimiento(), admin1.getFechaIngreso(), admin1.getSueldoBase(), admin1.getMontoValesDespensa(),
                    admin1.calcularImpuestos(admin1.getSueldoBase(), admin1.getMontoValesDespensa()), 
                    admin1.calcularPagoNeto(admin1.getSueldoBase(), admin1.getMontoValesDespensa(), admin1.calcularImpuestos(admin1.getSueldoBase(), admin1.getMontoValesDespensa())));
            
            
        }else{
            System.out.println("Opción invalida");
        }
        
        
        
    }
    
}
