package tareasHilos.CienPositivos;

public class Escribir100Positivos extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread() + "positivos " + i);
            // Thread.currentThread(): Imprimir el id del hilo
        }
    }
}