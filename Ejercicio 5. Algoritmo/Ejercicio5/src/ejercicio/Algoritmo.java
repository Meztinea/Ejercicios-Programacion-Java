package ejercicio;

/*
    Convertir grados de Celsius a Fahrenheit
*/

public class Algoritmo {
    
    public static void main(String[] args) {
        
        System.out.println(convertirCelsiusAFahrenheit(41));
        
    }
    
    
    public static double convertirCelsiusAFahrenheit(int celsius) {
        double fahrenheit = ((9.0 / 5.0) * celsius) + 32;
        return fahrenheit;
    }
}
