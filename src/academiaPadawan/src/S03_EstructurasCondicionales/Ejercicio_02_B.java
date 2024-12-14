/*
Crea un programa que pida una nota (número entero) y muestre si es Aprobado, Bien, Notable o Sobresaliente
 */
package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_02_B {
    public static void main(String[] args) {

        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota: ");
        nota = sc.nextInt();

        switch (nota){

            case 5:
                System.out.println("Aprobado.");
                break;
            case 6:
                System.out.println("Bien.");

                break;
            case 7,8:
                System.out.println("Notable.");

                break;
            case 9,10:
                System.out.println("Sobresaliente.");
                break;
            default:
                System.out.println("Reprobado.");
                break;
        }
    }
}
