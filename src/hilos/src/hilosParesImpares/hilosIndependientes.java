/*
Implemente un programa en java que use hilos independientes. Un hilo imprime números pares
del 1 al 10, y otro hilo imprime números impares del 1 al 10. Cree dos instancias (hilos) de cada
uno y muestre la salida. Realice el programa utilizando herencia y otro con la interfaz.
 */

package hilosParesImpares;

public class hilosIndependientes {
    public static void main(String[] args) throws InterruptedException {
        // Iniciar un hilo con Thread
        hiloPar h1 = new hiloPar();
        h1.start();

        // Iniciar un hilo con Runnable (hay que crearlo desde aquí)
        hiloImpar hilo = new hiloImpar();
        Thread h2 = new Thread(hilo);
        h2.start();
        h2.join();
    }
}