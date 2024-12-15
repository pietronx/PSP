package E04_HiloC;

public class HiloCR implements Runnable{
    private int c;

    // Constructor que indica la creación de cada hilo
    HiloCR(int c)
    {
        System.out.println("Creando hilo "+c);
        this.c = c;
    }
    @Override
    public void run() {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("Hilo "+ c + " línea "+ i);
        }
    }
}