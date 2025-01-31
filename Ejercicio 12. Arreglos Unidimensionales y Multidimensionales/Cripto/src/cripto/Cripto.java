
package cripto;

import java.util.Scanner;


public class Cripto {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        int opcion = 0;
        
        
        do{
            //Mostrando el menú y solicitando la opción
            System.out.println("Menú de opciones");
            System.out.println("1. Registro de transacción.");
            System.out.println("2. Impresión del registro por Id de transacción.");
            System.out.println("3. Impresión de toda la lista de transacciones.");
            System.out.println("4. Salir.\n");
            System.out.print("Elige una opción: ");
            
            opcion = entrada.nextInt();
            int nRegistros =0;
            
            
            
           
            //Ejecutando los métodos para cada opción
            switch (opcion){
                
                
                //Método para registrar una transacción
                case 1: 
                    
                     System.out.println("¿Cuantos registros deseas realizar?");
                     nRegistros = entrada.nextInt();
                    
                     Transaccion criptos[] = new Transaccion[nRegistros];
                     
                     for(int i=0; i<nRegistros; i++){
                         criptos[i] = new Transaccion();
                         }
                    
                     registrar(criptos,nRegistros);
                    
                    break;
                
                //Método para imprimir una transaccion por Id
                case 2:
                    int unRegistro = 0;
                    System.out.println("¿Cuál registro quieres imprimir?");
                    unRegistro = entrada.nextInt();
                    unRegistro++;
                    
                    criptos[unRegistro].getComision();
                    //imprimirUno(criptos);
                    break;
                //Método para imprimir toda la lista de transacciones
                case 3:
                    
                    break;
                    
                case 4:
                    System.out.println("Saliste del programa.");
                    break;
                
                default:
                    System.out.println("Opción incorrecta, elige nuevamente.");
                    break;
                
                
            }
            
            
        }while (opcion != 4);
        
        
        
        
        
        
        
    }
    
    public static void registrar(Transaccion cri[], int registros){
        Scanner entrada = new Scanner (System.in);
        
        
        
        for(int i=0; i<registros; i++){
                
                
                //Ingresando los datos por el usuario
                
                System.out.print("Elige el tipo de criptomoneda para el registro " + (i+1) + " "
                                + "(BTC, ETH, XRP, DOGE): ");
                cri[i].setCriptomoneda(entrada.nextLine());
                
                System.out.print("Elige el tipo de transacción (Compra/Venta): ");
                cri[i].setTipoTransaccion(entrada.nextLine());
                
                System.out.print("Introduce la cantidad de " + cri[i].getCriptomoneda() + ": ");
                cri[i].setCantidadCriptomoneda(entrada.nextInt());
                entrada.nextLine();
                
                System.out.println("Realizaste 1a " + cri[i].getTipoTransaccion() + " de " + cri[i].getCantidadCriptomoneda() +" "+ cri[i].getCriptomoneda());
                
                switch (cri[i].getCriptomoneda()){
                    
                    case "BTC":
                        
                        bitcoin(cri);
                        
                        break;
                        
                        
                    
                }
                
        }
        
    }
    
     public static void bitcoin(Transaccion criptos[]){
         
         double tipoCambio = 59000;
         double comision;
         double valorReal;
         
         
         for(int i=0; i<1; i++){
           
             //Calculando el monto de la transaccion
         criptos[i].setMontoTransaccion(tipoCambio * criptos[i].getCantidadCriptomoneda());
         
         
         //Calculando la comision
         if(criptos[i].getMontoTransaccion()<1000){
             
              criptos[i].setComision(criptos[i].getMontoTransaccion() * .05);
             
             
             
         }else if(criptos[i].getMontoTransaccion()>=1000){
             criptos[i].setComision(criptos[i].getMontoTransaccion() * .01);
         }
         
         
         //Calculando el valor real de la transaccion
         
         criptos[i].setValorRealTransaccion(criptos[i].getMontoTransaccion() + criptos[i].getComision());
         
         System.out.println("Monto de transacción: " + criptos[i].getMontoTransaccion() + ". Comisión: " + criptos[i].getComision()
                            + ". Valor total de Transacción: " + criptos[i].getValorRealTransaccion());
             
         }
         
         
         
         
     }
    
    
     public static void imprimirUno(){
         Scanner entrada = new Scanner (System.in);
         
         System.out.println("¿Cuál registro deseas imprimir?");
         int registro = entrada.nextInt() + 1;
         
         
     }
     
     
     
     
    
}
