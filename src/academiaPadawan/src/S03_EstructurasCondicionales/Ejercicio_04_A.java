/*
Crea un programa que pida dos números enteros y muestre cuál es el mayor o si son iguales
*/
package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_04_A {
    public static void main(String[] args) {

        int enteroA;
        int enteroB;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer entero: ");
        enteroA = sc.nextInt();

        System.out.println("Introduce el segundo entero: ");
        enteroB = sc.nextInt();

        System.out.println("-------------------------------");

        if (enteroA > enteroB) {
            System.out.printf("%d es mayor que %d", enteroA, enteroB);
        } else if (enteroA < enteroB) {
            System.out.printf("%d es mayor que %d", enteroB, enteroA);
        } else {
            System.out.println("Son iguales");
        }
    }
}