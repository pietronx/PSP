/*
Crea un programa que pida un número entero entre 0 y 10, y luego lo muestre de la forma: cero, uno, dos, tres...
*/

package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_03_B {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre el 0 y el 10: ");
        numero = sc.nextInt();

        switch (numero){

            case 0:
                System.out.println("cero.");
                break;
            case 1:
                System.out.println("uno.");
                break;
            case 2:
                System.out.println("dos.");
                break;
            case 3:
                System.out.println("tres.");
                break;
            case 4:
                System.out.println("cuatro.");
                break;
            case 5:
                System.out.println("cinco.");
                break;
            case 6:
                System.out.println("seis.");
                break;
            case 7:
                System.out.println("siete.");
                break;
            case 8:
                System.out.println("ocho.");
                break;
            case 9:
                System.out.println("nueve.");
                break;
            case 10:
                System.out.println("diez.");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}