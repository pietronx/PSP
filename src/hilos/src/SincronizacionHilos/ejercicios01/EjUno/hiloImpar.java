package SincronizacionHilos.ejercicios01.EjUno;

public class hiloImpar extends Thread {
    private final contador contador; //

    public hiloImpar(String n, contador c) { // El string para saber el nombre del hilo
        setName(n);
        contador = c;
    }

    @Override
    public void run() {
        super.run();

        do {
            if (contador.getValor() % 2 != 0) {
                System.out.println(getName() + " antes de incrementar, contador vale " + contador.getValor());
                contador.incrementar();
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println(getName() + " contador vale " + contador.getValor());
            }
        }
        while (contador.getValor() < 20);
    }
}