package raton;
public class Raton
{
    private String nombre;
    private int tiempoAlimentacion;

    //  Constructor
    public Raton(String nombre, int tiempoAlimentacion)
    {
        super();
        this.nombre=nombre;
        this.tiempoAlimentacion=tiempoAlimentacion;
    }

    //  Metodo comer
    public void comer()
    {
        try {
            System.out.printf("Raton %s ha comenzado a alimentarse\n",nombre);
            // Thread = Hilos
            Thread.sleep(tiempoAlimentacion * 1000); // 1000 = milisegundos
            System.out.printf("Raton %s ha terminado de alimentarse, ha tardado %d segundos\n",nombre, tiempoAlimentacion);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        //  Creamos un objeto raton
        Raton uno = new Raton("Mickey",3);
        Raton dos = new Raton("Ricky",4);
        Raton tres = new Raton("Alfred",6);
        Raton cuatro = new Raton("Carlos",8);

        uno.comer();
        dos.comer();
        tres.comer();
        cuatro.comer();
    }
}
