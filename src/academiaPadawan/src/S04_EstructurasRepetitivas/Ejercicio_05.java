package S04_EstructurasRepetitivas;

/*
Escribe un programa que muestre el cuadrado de todos los números entre 1 y 20
 */
public class Ejercicio_05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            int cuadrado= (int)(Math. pow(i,2));
            System.out.println("El cuadrado de " + i + " es: " + cuadrado);
        }
    }
}
