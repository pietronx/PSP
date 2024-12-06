/* Programa que imprima 10 numeros del 0 al 1, saque el minimo, el maximo y el sumatorio */

package repasoInterfaces;
public class arrayReales implements Estadisticas {

    private final double[] hamburguesa;
    private int tamano;

    public arrayReales(int tamano) {
        this.tamano = tamano;
        this.hamburguesa = new double[tamano];
        for (int i = 0; i < hamburguesa.length; i++) {
            hamburguesa[i] = Math.random();
        }
    }

    public double minimo() {
        double menor = hamburguesa[0];
        for (int i = 0; i < hamburguesa.length; i++) {
            if (menor > hamburguesa[i]) {
                menor = hamburguesa[i];
            }
        }
        return menor;
    }

    public double maximo() {
        double mayor = hamburguesa[0];
        for (int i = 0; i < hamburguesa.length; i++) {
            if (mayor < hamburguesa[i]) {
                mayor = hamburguesa[i];
            }
        }
        return mayor;
    }

    public double sumatorio() {
        double suma = 0.0;
        for (int i = 0; i < hamburguesa.length; i++) {
            suma += hamburguesa[i];
        }
        return suma;
    }

    public void imprimir() {
        for (int i = 0; i < hamburguesa.length; i++) {
            System.out.println("x [" + i + "] = " + hamburguesa[i]);
        }
    }
}