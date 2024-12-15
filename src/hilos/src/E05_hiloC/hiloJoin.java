package E05_hiloC;

public class hiloJoin implements Runnable {

    private int h;

    hiloJoin(int h) {
        System.out.println("Creando hilo " + h);
        this.h = h;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + h + " línea " + i);
        }
    }
}