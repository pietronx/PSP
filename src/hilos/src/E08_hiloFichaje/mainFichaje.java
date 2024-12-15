package E08_hiloFichaje;

/*
Crear un programa que permita realizar el fichaje de entrada a los trabajadores de una empresa.
Para ello, al llegar, deberán registrar su nombre y su hora de entrada (datos que se le pedirán al
usuario). Teniendo en cuenta que la hora de entrada es a las 9:00, se les mostrará un mensaje
tras su fichaje indicando si han llegado a tiempo o se han retrasado.
*/

import java.util.Scanner;

public class mainFichaje {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Fichaje empresarial");
        System.out.println("---------------------");
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca la hora de entrada: ");
        int hora = sc.nextInt();

        fichaje hilo = new fichaje(nombre,hora);
        Thread h = new Thread(hilo);
        h.start();

    }
}