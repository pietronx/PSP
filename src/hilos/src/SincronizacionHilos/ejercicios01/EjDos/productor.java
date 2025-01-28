package SincronizacionHilos.ejercicios01.EjDos;

public class productor extends Thread {
    private final cont c;

    public productor(SincronizacionHilos.ejercicios01.EjDos.cont c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();

        do {
            if(c.getContador() < 10){
                c.incrementar();
                try {
                    sleep(10);
                } catch (InterruptedException e){}
                System.out.println("Contador vale " + c.getContador());
            }
        }
        while (c.getContador() < 10);
    }
}
