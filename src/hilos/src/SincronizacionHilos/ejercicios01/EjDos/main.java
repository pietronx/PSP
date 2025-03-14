package SincronizacionHilos.ejercicios01.EjDos;
/*
Implementa un sistema en el que un productor incrementa un contador y un consumidor lo decrementa.
El productor no puede incrementar el contador si este ha alcanzado un límite superior,
y el consumidor no puede decrementarlo si ya está en su valor mínimo.

• El productor incrementará el contador hasta un valor máximo (por ejemplo, 10).
• El consumidor decrementará el contador hasta un valor mínimo (por ejemplo, 0).
• Ambos threads deben trabajar coordinados, y no deben modificar el contador simultáneamente.
• El programa imprimirá el valor del contador y la acción realizada (incremento o decremento) en cada operación.
 */
public class main {
    public static void main(String[] args) throws InterruptedException {

        cont cont = new cont(0);

        productor p1 = new productor(cont);

        consumidor p2 = new consumidor(cont);
        Thread t2 = new Thread(p2);

        p1.start();
        p1.join();

        t2.start();
        t2.join();
    }
}
