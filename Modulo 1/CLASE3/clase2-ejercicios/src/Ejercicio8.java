import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /* 
         * Ejercicio 8: Área y Perímetro de un Rectángulo
         * Crea un programa que calcule el área y el perímetro de un rectángulo. 
         * Solicita al usuario la longitud y el ancho del rectángulo.
         */

         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite el valor de la base del rectangulo: ");
         var b= scanner.nextDouble();
         System.out.println("Digite el valor de la altura del rectangulo: ");
         var h= scanner.nextDouble();
         scanner.close();

         var area = b*h;
         var perimetro = (b*2) + (h*2);

         System.out.println("Area: "+ area);
         System.out.println("Perimetro: " + perimetro);
    }
}
