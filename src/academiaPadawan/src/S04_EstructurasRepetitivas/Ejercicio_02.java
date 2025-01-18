package S04_EstructurasRepetitivas;

import java.util.Scanner;

/*
Crea un programa que muestre un menú con opciones:
Saludar
Preguntar qué tal
Despedirse
El programa debe ejecutar la acción correspondiente según la opción elegida
y repetir el menú hasta que el usuario elija la opción 3.
 */
public class Ejercicio_02 {
    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nElija una de la siguienes opciones:\n");
            System.out.println("1. Saludar");
            System.out.println("2. Preguntar qué tal");
            System.out.println("3. Despedirse");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nHola!");
                    break;
                case 2:
                    System.out.println("\n¿Qué tal?");
                    break;
                case 3:
                    System.out.println("\nAdiós!");
                    break;
            }
        } while (opcion >= 1 && opcion <= 2);
        System.out.println("\nPrograma finalizado.");
    }
}
