package E10_hiloEstaciones;

import java.util.Scanner;

/*
Crear un programa que tenga almacenadas las estaciones del año en un array. El usuario pasará
una de las 4 estaciones, y en función de la elegida, se mostrarán los meses que le corresponden,
con una escala de tiempo entre ellos.
*/
public class mainEstaciones {
    public static void main(String[] args) {

        String estacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una estación");
        estacion = sc.nextLine();
        estaciones e1 = new estaciones(estacion);

        Thread h1 = new Thread(e1);
        h1.start();

    }
}
