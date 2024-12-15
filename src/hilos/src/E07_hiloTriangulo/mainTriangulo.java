package E07_hiloTriangulo;

/*
Crear un programa que lance 10 hilos de ejecución donde a cada hilo se le pasará la base y la
altura de un triángulo, y cada hilo ejecutará el cálculo del área de dicho triángulo informando de
qué base y qué altura recibió y cuál es el área resultado
 */

import java.util.Scanner;

public class mainTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce la base: ");
            int baseUser = sc.nextInt();
            System.out.println("Introduce la alturaUser: ");
            int alturaUser = sc.nextInt();

            areaTriangulo hilo = new areaTriangulo(baseUser, alturaUser);
            hilo.start();
        }
    }
}