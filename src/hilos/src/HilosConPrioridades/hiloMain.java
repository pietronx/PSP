package HilosConPrioridades;

public class hiloMain extends Thread
{
    public void run()
    {
        System.out.println("Dentro del Hilo:" + this.getName () + ", Prioridad: "+ this.getPriority() + ", ID: " + this.getId());
    }
    public static void main(String[] args)
    {
        hiloMain h1;
        for (int i = 0; i < 3; i++) {
            h1 = new hiloMain () ; //crear hilo
            h1 .setName("HIL0"+i); //damos nombre al hilo
            h1 .setPriority(i+1); //damos prioridad
            h1.start(); //iniciar hilo
            System.out.println("Informacion del " + h1.getName() +": "+ h1);
            System.out.println("3 HILOS CREADOS...");
        }
    }
}