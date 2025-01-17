public class Ejercicio2 {
    public static void main(String[] args) {

/* Ejercicio 2: 
¿Ves algún error en el precio?
En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. 
Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por 
kilo cuesta 29,75€. ¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por 
kilo del producto. */

        double cienGramo = 5.95;
        int gramo_a_kilo= 10;
        
        var kilo = cienGramo*gramo_a_kilo;

        System.out.println("Precio por kilo: "+ kilo + " €");

/* ¿Crees que es correcto el precio?
    R// No, el verdadero precio es 59.5€
 */
    }
}
