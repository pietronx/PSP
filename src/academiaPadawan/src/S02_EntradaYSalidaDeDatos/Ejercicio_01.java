/*
Crea un programa que pida los datos necesarios para dar de alta a un usuario y luego los muestre por pantalla:

Nombre y apellidos
Edad
Nombre de usuario (Nick)
Cuota a pagar
 */
package S02_EntradaYSalidaDeDatos;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {

        String nombre;
        String apellidos;
        String usuario;
        int edad;
        double cuota;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();

        System.out.println("Ingresa tus apellidos");
        apellidos = sc.nextLine();

        System.out.println("Ingresa tu edad");
        edad = sc.nextInt();

        System.out.println("Ingresa tu usuario");
        usuario = sc.next();

        System.out.println("Ingresa la cuota a pagar");
        cuota = sc.nextDouble();

        System.out.println("Datos recogidos:");
        System.out.println("========================");
        System.out.println("Nombre y apellidos: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad + " años");
        System.out.println("User: " + usuario);
        System.out.println("Cuota a pagar " + cuota + "€");

    }
}
