package SincronizacionHilos.ejercicios.EjCero;

public class hiloA extends Thread {
    private final contador contador;

    public hiloA(String n, contador c) {
        setName(n);
        contador = c;
    }

    @Override
    public void run() {
        for (int j = 0; j < 300; j++) {
            contador.incrementa(); // Incrementa el contador
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " contador vale " + contador.getValor());
    }
}