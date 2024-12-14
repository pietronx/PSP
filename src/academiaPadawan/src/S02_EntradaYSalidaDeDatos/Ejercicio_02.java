/*
Modifica el ejercicio anterior de manera que primero pida la edad y luego Nombre y apellidos.
 */
package S02_EntradaYSalidaDeDatos;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {

        String nombre;
        String apellidos;
        String usuario;
        int edad;
        double cuota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad");
        edad = sc.nextInt();
        sc.nextLine();
        //  Cambiamos todos los sc.nextLine() por sc.next()
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();

        System.out.println("Ingresa tus apellidos");
        apellidos = sc.nextLine();

        System.out.println("Ingresa tu usuario");
        usuario = sc.nextLine();

        System.out.println("Ingresa la cuota a pagar");
        cuota = sc.nextDouble();

        System.out.println("Datos recogidos:");
        System.out.println("========================");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nombre y apellidos: " + nombre + " " + apellidos);
        System.out.println("User: " + usuario);
        System.out.println("Cuota a pagar " + cuota + "€");

    }
}
