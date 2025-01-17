import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /* 
         * Ejercicio 10: Media Aritmética
         * Crea un programa que calcule la media aritmética de tres números introducidos 
         * por el usuario.
         */

         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite tres numeros: ");
         double a = scanner.nextDouble();
         double b = scanner.nextDouble();
         double c = scanner.nextDouble();
         scanner.close();

         var promedio = (a+b+c)/3;

         System.out.println("Media aritmetica: "+promedio);
    }
}
