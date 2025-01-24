/*Clase Docente hereda de clase Personal e implementa los métodos de la interfaz Metodos
Incluye dos atributos propios y hereda los de la clase personal implementa 3 métodos de la interfaz Metodos
Contiene los métodos setter y getter para cada atributo.
Calcula el sueldo bruto, impuestos y sueldo neto del docente
*/


package ac;


public class Docente extends Personal implements Metodos {
    
    //Atributos de la clase Docente que es hija de Personal e implementa de Metodos
    double sueldoBase;
    double montoBecaAcademica;
    
    //Métodos Setter de la clase Docente
    public void setSueldoBase(double sueldoBase){
        this.sueldoBase = sueldoBase;
        
        
    }

    public void setMontoBecaAcademica(double montoBecaAcademica) {
        this.montoBecaAcademica = montoBecaAcademica;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

   
    
    //Getter de cada atributo heredado y propio

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getMontoBecaAcademica() {
        return montoBecaAcademica;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }


    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    
    public double calcularImpuestos(double sueldo, double beca){
        double monto = sueldo + beca;
        double impuestos = monto* 0.15;
        return (double) impuestos;
    }
    
    
    public double calcularPagoNeto(double sueldo, double beca, double impuestos){
        double pagoNeto = (sueldo + beca) - impuestos;
        return (double) pagoNeto;
    }

   

   
    public void mostrarDatos(int empleado,String nombre,String apellidoP,String apellidoM,String fecha1,String fecha2,double sueldo,double beca,double impuestos,double neto) {
        
        System.out.println("\n\nRegistraste los siguientes datos: ");
            
            System.out.println("Número empleado: " + empleado);
            System.out.println("Nombre: " + nombre + " " + apellidoP
                                + " " + apellidoM);
            
            System.out.println("Fecha Nacimiento: " + fecha1);
            System.out.println("Fecha Ingreso: " + fecha2);
            
            System.out.println("Ingresos Brutos: " + (sueldo + beca));
            System.out.println("Impuestos: " + impuestos);
            System.out.println("Sueldo neto: " + neto);
        
    }
    
}
