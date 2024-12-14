/*
Crea un programa que pida el día, mes y año de una fecha e indique si la fecha es correcta.
Supondremos que todos los meses son de 30 días
 */
package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_05_A {
    public static void main(String[] args) {

        int dia, mes, anio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el dia: ");
        dia = sc.nextInt();
        System.out.println("Escribe el mes: ");
        mes = sc.nextInt();
        System.out.println("Escribe el año: ");
        anio = sc.nextInt();

        System.out.println("-------------------------------");

        if (dia > 0 && dia <= 30 && mes >= 1 && mes <= 12) {
            System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}