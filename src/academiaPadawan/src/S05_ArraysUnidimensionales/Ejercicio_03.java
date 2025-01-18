package S05_ArraysUnidimensionales;
/*
Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir,
el primero que se introduce es el último en mostrarse y viceversa.
 */

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        System.out.println("Introduce 10 numeros: ");
        numeros[9] = sc.nextInt();
        numeros[8] = sc.nextInt();
        numeros[7] = sc.nextInt();
        numeros[6] = sc.nextInt();
        numeros[5] = sc.nextInt();
        numeros[4] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[0] = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
