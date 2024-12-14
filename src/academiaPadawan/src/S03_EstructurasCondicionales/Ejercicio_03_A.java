/*
Crea un programa que pida dos números enteros y muestre si el segundo es múltiplo del primero.
 */
package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_03_A {
    public static void main(String[] args) {

        int entero1;
        int entero2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer entero: ");
        entero1 = sc.nextInt();

        System.out.println("Introduce el segundo entero: ");
        entero2 = sc.nextInt();

        System.out.println("-------------------------------");

        if (entero2 % entero1 == 0) {
            System.out.printf("%d es multiplo de %d", entero2, entero1);
        } else {
            System.out.println("No es multiplo");
        }
    }
}
