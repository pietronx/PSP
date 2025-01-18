package S04_EstructurasRepetitivas;

import java.util.Scanner;

/*
Escribe un programa que siga pidiendo al usuario números positivos y sume esos valores.
El programa debe terminar cuando el usuario introduzca un número negativo.
 */
public class Ejercicio_03 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();

        } while (num >= 0);
        System.out.println("\nPrograma finalizado.");

    }
}


