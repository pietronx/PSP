package SincronizacionHilos.ejercicios01.EjDos;

public class productor extends Thread {
    private final cont c;

    public productor(SincronizacionHilos.ejercicios01.EjDos.cont c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        // Haz esto
        do {
            c.incrementar();
            try {
                sleep(10);
            } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("Productor incrementa el contador: " + c.getContador());
        }
        // Mientras se cumpla esto
        while (c.getContador() < 10);
    }
}
