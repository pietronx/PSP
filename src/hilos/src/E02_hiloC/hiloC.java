/*
Crea una nueva clase llamada HiloC, que herede de thread, que tenga un atributo entero int c.
En el constructor, se le pasa el valor de c como parámetro, e imprime el mensaje “Creando hilo
c”, donde c es valor pasado por parámetro.
En su metodo run() imprimirá 5 veces el mensaje “Hilo c línea x”, donde x es el número de línea.
Crea la clase VariosHilos que, en un bucle, cree y lance 5 objetos HiloC, pasando a cada uno los
valores 1, 2, 3, 4 y 5 respectivamente. Antes de finalizar el main, imprimirá el mensaje “Todos
los hilos creados”.
*/
package E02_hiloC;
public class hiloC extends Thread{
    private int c;

    // Constructor que indica la creación de cada hilo
    hiloC(int c)
    {
        System.out.println("Creando hilo "+c);
        this.c = c;
    }

    // Metodo run para imprimir el Hilo y la línea en la que esta;
    @Override
    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("Hilo "+ c + " línea "+ i);
        }
    }
}
