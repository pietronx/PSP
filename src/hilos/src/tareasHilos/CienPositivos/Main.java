package tareasHilos.CienPositivos;
/*
Crea una clase Escribir100Positivos que extendienda de Thread y
otra clase Escribir100Negativos implements runnable.

Desde un programa Principal
Lanza 3 veces la clase Escribir100Positivos como hilo.
Lanza 3 veces la clase Escribir100Negativos como hilo
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Runnable
        for(int i = 1;i<=3;i++){

            // Forma de hacerlo sencillo
            // Thread h1 = new Thread(new Escribir100Negativos());
            // h1.start();

            Escribir100Negativos h4 = new Escribir100Negativos();
            Thread th = new Thread(h4);
            th.start();
            th.join();
            System.out.println("----------------------------");
        }

        // Thread
        for(int i = 1;i<=3;i++){
            Escribir100Positivos h1 = new Escribir100Positivos();
            h1.start();
            h1.join();
            System.out.println("----------------------------");
        }
    }
}