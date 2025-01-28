package SincronizacionHilos.ejercicios02.EjUno;

public class contador {

    private int c = 0; // Atributo contador

    contador(int c) {
        this.c = c;
    }

    synchronized public void incrementa() {
            c = c + 1;
    }

    synchronized public int getValor() {
        return c;
    }
}

