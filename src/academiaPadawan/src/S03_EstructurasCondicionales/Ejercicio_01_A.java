package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_01_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Eres un adolescente");
        } else if (edad < 40) {
            System.out.println("Eres joven");
        } else if (edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Cuidate");
        }
    }
}
