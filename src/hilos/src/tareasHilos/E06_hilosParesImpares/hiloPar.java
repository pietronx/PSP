package tareasHilos.E06_hilosParesImpares;

public class hiloPar extends Thread {

    @Override
    // Bucle para sacar numeros pares del 1 al 10
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("par " + i);
            }
        }
    }
}
