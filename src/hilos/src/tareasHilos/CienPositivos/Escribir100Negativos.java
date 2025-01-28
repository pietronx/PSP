package tareasHilos.CienPositivos;

public class Escribir100Negativos implements Runnable {

    public void run() {
        for (int i = -1; i >= -100; i--) {
            System.out.println(Thread.currentThread() + "negativos " + i);
            // Thread.currentThread(): Imprimir el id del hilo
        }
    }
}