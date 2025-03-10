package SincronizacionHilos.ejercicios01.EjDos;

import static java.lang.Thread.sleep;

public class consumidor implements Runnable {
    private final cont c;

    public consumidor(SincronizacionHilos.ejercicios01.EjDos.cont c) {
        this.c = c;
    }

    @Override
    public void run() {
        // Haz esto
        do {
            c.decrementar();
            try {
                sleep(10);
            } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("Consumidor decrementa el contador:" + c.getContador());
        }
        // Mientras se cumpla esto
        while (c.getContador() > 0);
    }
}