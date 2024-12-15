package E02_hiloC;
public class variosHilos {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            hiloC h = new hiloC(i);
            h.start();
        }
        System.out.println("\nTodos los hilos creados\n");
    }
}
