package E04_HiloC;

public class VariosHilosR {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            HiloCR hilo = new HiloCR(i);
            Thread h = new Thread(hilo);
            h.start();
        }
        System.out.println("\nTodos los hilos creados\n");
    }
}
