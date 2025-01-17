import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /* 
         * Ejercicio 9: Conversión de Temperaturas
         * Escribe un programa que convierta una temperatura dada en grados Celsius a 
         * grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
         * 
         * Fahrenheit = Celsius * 9/5 + 32
         * Kelvin = Celsius + 273.15
         */

         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite temperatura (grado Celcius): ");
         double celsius = scanner.nextDouble();
         scanner.close();

         var Fahrenheit = (celsius * 9)/5 + 32;
         var Kelvin = celsius + 273.15;

         System.out.println("Fahrenheit = " + Fahrenheit);
         System.out.println("Kelvin = "+Kelvin);
    }
}
