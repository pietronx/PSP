package raton;

public class RatonInterface implements Runnable {
    private String nombre;
    private int tiempoAlimentacion;

    public RatonInterface(String nombre, int tiempoAlimentacion){
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    public void comer () {
        try {
            System.out.printf("El raton %s ha comenzado a alimentarse\n", nombre);
            Thread.sleep(tiempoAlimentacion * 1000);
            System.out.printf("El raton %s ha terminado a alimentarse\n", nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.comer();
    }

    public static void main(String[] args) {

        RatonInterface fievel = new RatonInterface("Fievel",3);
        RatonInterface juan = new RatonInterface("Juan",5);
        RatonInterface mike = new RatonInterface("Mike",7);
        RatonInterface jerry = new RatonInterface("Jerry",1);

        new Thread(fievel).start();
        new Thread(fievel).start();
        new Thread(juan).start();
        new Thread(mike).start();
        new Thread(jerry).start();
    }
}
