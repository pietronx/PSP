/*
Crea un programa que pida dos números enteros y muestre por pantalla si son o no iguales
 */

package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_02_A {
    public static void main(String[] args) {

        int enteroA;
        int enteroB;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer entero: ");
        enteroA = sc.nextInt();

        System.out.println("Introduce el segundo entero: ");
        enteroB = sc.nextInt();

        System.out.println("-------------------------------");

        if (enteroA == enteroB) {
            System.out.println("Los enteros son iguales");
        } else {
            System.out.println("Los enteros son diferentes");
        }
    }
}
