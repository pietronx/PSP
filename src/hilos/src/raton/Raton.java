package raton;
public class Raton
{
    private String nombre;
    private int tiempoAlimentacion;

    //  Constructor
    Raton(String nombre, int tiempoAlimentacion)
    {
        this.nombre=nombre;
        this.tiempoAlimentacion=tiempoAlimentacion;
    }

    //  Getters
    public String getNombre() {
        return nombre;
    }

    public int getTiempoAlimentacion() {
        return tiempoAlimentacion;
    }

    // Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setTiempoAlimentacion(int tiempoAlimentacion)
    {
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    //  Metodo comer
    public void comer()
    {
        System.out.println("");
        System.out.println("Raton "+getNombre()+" ha comenzado a alimentarse");
        System.out.println("");
        System.err.println("Raton "+getNombre()+" ha terminado de alimentarse, ha tardado "+getTiempoAlimentacion()+" minutos");

    }

    public static void main(String[] args)
    {
        //  Creamos un objeto raton
        Raton uno = new Raton("Mickey",3);
        uno.comer();
    }
}
