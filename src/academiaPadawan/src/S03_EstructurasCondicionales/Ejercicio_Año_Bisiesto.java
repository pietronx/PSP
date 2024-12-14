/*
Cualquier año divisible por 4 es un año bisiesto a excepción de aquellos que, siendo divisibles por 100, no lo son por 400.
Teniendo esto en cuenta desarrollar un programa en Java que reciba por teclado un año y determine si es un año bisiesto o no.
 */
package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_Año_Bisiesto {
    public static void main(String[] args) {
        int anio = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        anio = sc.nextInt();

        // Es divisible entre 4 y no divisible entre 100, o es divisible entre 400.
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("Año bisiesto");
        } else {
            System.out.println("Año no bisiesto");
        }
    }
}