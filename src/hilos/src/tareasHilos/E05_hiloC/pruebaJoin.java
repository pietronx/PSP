package E05_hiloC;

public class pruebaJoin {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            hiloJoin h = new hiloJoin(i);
            Thread hilo = new Thread(h);
            hilo.start();
            hilo.join();
        }
        System.out.println("Todos los hilos creados\n");
    }
}