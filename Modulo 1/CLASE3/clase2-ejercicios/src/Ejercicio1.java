public class Ejercicio1 {
public static void main(String[] args) {

/* El orden de los operadores aritméticos es muy importante ya que dependiendo del orden obtenemos un resultado u otro. En programación, el orden de los operadores es el mismo que el utilizado en matemáticas.
En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.
 */

    var ejercicio1 =6/2*(1+2);
    System.out.println(ejercicio1);

/* ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
        6/2*(1+3)
        6/2*(3)
        3*3
    R// 9
    Explique por que la otra calculadora genera un resultado diferente. 
    R// No se tubo en cuenta la gerarquia de operaciones. Para que diera 1 
        se realizaron las siguientes operaciones en este orden:

        6/2*(1+3)
        6/2*(3)
        6/6
        1

    */
    }
}
