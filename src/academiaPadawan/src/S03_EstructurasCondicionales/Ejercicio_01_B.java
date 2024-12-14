package S03_EstructurasCondicionales;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_01_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        System.out.println("---------------");

        int figura = sc.nextInt();

        switch (figura) {

            case 1:
                // Crea un alert dialog donde nos pide introducir los lados del cuadrado
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
                // Math.pow es para calcular la potencia de un número: Math.pow(base,exponente)
                System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
                break;
            case 2:
                // area del rectangulo
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del rectangulo es: " + base * altura);
                break;
            case 3:
                // area del triangulo
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del triángulo es: " + base * altura / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El area del circulo es ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
                break;
            default:
                System.out.println("La opcion no es correcta.");
        }
    }
}