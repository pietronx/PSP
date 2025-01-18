package S04_EstructurasRepetitivas;

import java.util.Scanner;

/*
Escribe un programa que pida al usuario una contraseña y valide si es correcta.
Si el usuario falla, se le debe permitir intentarlo nuevamente.
El programa termina cuando el usuario introduce la contraseña correcta.
 */
public class Ejercicio_01 {
    public static void main(String[] args) {

        int passw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        passw = sc.nextInt();

        while (true) {
            if (passw == 12345) {
                System.out.println("Contraseña correcta.");
                return;
            } else {
                System.out.println("Contraseña incorrecta, intentelo de nuevo:");
                passw = sc.nextInt();
            }
        }
    }
}

