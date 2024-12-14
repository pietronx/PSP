package raton;

public class RatonHilo extends Thread{

    private String nombre;
    private int tiempoAlimentacion;

    public RatonHilo (String nombre, int tiempoAlimentacion){
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    private void comer(){
        try{
            System.out.printf("El raton %s ha comenzado a alimentarse\n", nombre);
            Thread.sleep(tiempoAlimentacion*1000);
            System.out.printf("El rat�n %s ha terminado a alimentarse\n", nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        this.comer();
    }

    public static void main(String[] args) {
        RatonHilo fievel = new RatonHilo("Fievel",3);
        RatonHilo juan = new RatonHilo("Juan",5);
        RatonHilo mike = new RatonHilo("Mike",7);
        RatonHilo jerry = new RatonHilo("Jerry",1);

        fievel.start();
        juan.start();
        mike.start();
        jerry.start();

    }
}