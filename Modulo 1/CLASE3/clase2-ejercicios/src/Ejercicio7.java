import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        /* 
         * Ejercicio 7: Calculadora Básica
         * Escribe un programa que solicite al usuario dos números y luego realice las 
         * operaciones de suma, resta, multiplicación y división con esos números. 
         * Muestra los resultados en la consola.
         */

         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese dos numeros: ");
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         scanner.close();
         var suma= a+b;
         System.out.println("suma:  "+suma);
         var resta=a-b;
         System.out.println("Resta: "+resta);
         var multiplicación= a*b;
         System.out.println("multiplicacion: "+multiplicación);
         var división = (double)a/b;
        System.out.println("Division: "+división);
    }
}
