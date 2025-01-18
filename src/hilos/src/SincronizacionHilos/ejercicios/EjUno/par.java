package SincronizacionHilos.ejercicios.EjUno;

public class par extends Thread {
    private final contador contador;

    public par( contador c) {
        this.contador = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (contador.getValor() % 2 == 0) {
                contador.incrementa(); // Incrementa el contador
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hilo Par");
            }
            System.out.println(contador.getValor());
        }
    }
}