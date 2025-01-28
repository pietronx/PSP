package SincronizacionHilos.ejercicios01.EjDos;

public class cont {

    private int c = 0;

    public cont(int c) {
        this.c = c;
    }

    synchronized void incrementar() {
        c = c + 1;
    }

    synchronized void decrementar() {
        c = c - 1;
    }

    public int getContador() {
        return c;
    }
}