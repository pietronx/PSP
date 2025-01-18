package SincronizacionHilos.ejercicios.EjCero;

public class hiloB extends Thread {
    private final contador contador;

    public hiloB(String n, contador c) {
        setName(n);
        contador = c;
    }

    public void run() {
        for (int j = 0; j < 300; j++) {
            contador.decrementa(); //decrementa el contador
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " contador vale " + contador.getValor());
    }
}