package SincronizacionHilos.ejercicios.EjCero;

public class contador {

    private int c = 0; // Atributo contador

    contador(int c) {
        this.c = c;
    }

    synchronized public void incrementa() {
        c = c + 1; // c++
    }

    synchronized public void decrementa() {
        c = c - 1; // c--
    }

    synchronized public int getValor() {
        return c;
    }
}