package SincronizacionHilos.ejercicios01.EjDos;

public class consumidor extends Thread {
    private final cont c;

    public consumidor(SincronizacionHilos.ejercicios01.EjDos.cont c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();

        do {
            if(c.getContador() > 10){
                c.decrementar();
                try {
                    sleep(10);
                } catch (InterruptedException e){}
                System.out.println("Contador vale " + c.getContador());
            }
        }
        while (c.getContador() > 0);
    }
}