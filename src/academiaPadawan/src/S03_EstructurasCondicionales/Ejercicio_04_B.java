/* Crea un programa que pida el código de un producto y el número de unidades de ese producto que se van a solicitar.
Luego debe mostrar el precio total de la compra, sabiendo que el producto con código 1 tiene un precio de 2.3€ la unidad,
el de código 2 tiene un precio de 3€ la unidad y el de código 3 cuesta 8.3€ la unidad
 */
package S03_EstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio_04_B {
    public static void main(String[] args) {

        int codigo, unidades;
        double precio = 0.0;
        double precioTotal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo del producto, solo disponibles del 1 al 3: ");
        codigo = sc.nextInt();
        System.out.println("Introduce las unidades a comprar: ");
        unidades = sc.nextInt();

        switch (codigo) {
            case 1:
                precio = 2.3;
                break;
            case 2:
                precio = 3;
                break;
            case 3:
                precio = 8.3;
                break;
        }
        precioTotal = precio * unidades;
        System.out.println("El precio de la compra es: " + precioTotal + "€");
    }
}