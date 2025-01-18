package S05_ArraysUnidimensionales;

import java.util.Random;

/*
Define tres arrays de 20 números enteros cada uno, con los nombres número, cuadrado y cubo.
Carga el array número con valores aleatorios entre 0 y 100.
En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array número.
En el array cubo se deben almacenar los cubos de los valores que hay en número.
A continuación, muestra el contenido de los tres arrays.
 */

public class Ejercicio_04 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        double[] cubo = new double[20];

        Random ran = new Random();
        int i;

        // 1
        for (i = 0; i < numero.length; i++) {
            numero[i] = ran.nextInt(101);
            System.out.print(numero[i] + " ");
        }

        System.out.println("");

        // 2
        for (i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            // cuadrado[i] = numero[i] * numero[i];
            System.out.print(cuadrado[i] + " ");
        }

        System.out.println("");

        // 3
        for (i = 0; i < cubo.length; i++) {
            cubo[i] = Math.pow(numero[i], 3);
            // cubo[i] = numero[i] * numero[i] * numero[i];
            System.out.print(cubo[i] + " ");
        }
    }
}
