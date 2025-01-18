package S04_EstructurasRepetitivas;


import java.util.Scanner;

/*
Escribe un programa que genere un número aleatorio entre 1 y 100.
El usuario debe intentar adivinarlo introduciendo valores,
el ordenador indicará si el número introducido es mayor o menor que el número que se busca.
El programa termina cuando el usuario acierta.
 */
public class Ejercicio_04 {
    public static void main(String[] args) {

        int num;
        int guessNum;
        num = (int) (Math.random() * 10);
        System.out.println(num);

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina un numero:");
        guessNum = sc.nextInt();

        while (true) {
            if (guessNum > num) {
                System.out.println("El numero es mayor");
                System.out.println("Intentalo de nuevo:\n");
                guessNum = sc.nextInt();

            } else if (guessNum < num) {
                System.out.println("El numero es menor");
                System.out.println("Intentalo de nuevo:\n");
                guessNum = sc.nextInt();

            } else {
                System.out.println("Has acertado el numero!");
                System.out.println("Programa finalizado.");
                return;
            }
        }
    }
}