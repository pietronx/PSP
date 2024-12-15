package E01_hiloFor;

public class DentroFuera {
    public static void main(String[] args) {
        HiloFor hilo1 = new HiloFor();
        hilo1.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("Estoy fuera del hilo "+i);
        }
    }
}
