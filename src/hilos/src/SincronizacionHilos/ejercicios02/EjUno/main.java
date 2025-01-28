package SincronizacionHilos.ejercicios02.EjUno;
/*
Diseña un programa en el que dos threads incrementen de manera alternada una variable compartida.
La variable solo puede ser incrementada si su valor actual es par o impar,
según el thread que intente realizar la operación.
Para ello, se tendrán en cuenta los siguientes requisitos:
La variable inicial será 0.
El thread 1 incrementará la variable solo si es par.
El thread 2 incrementará la variable solo si es impar.
Cada thread imprimirá un mensaje indicando el valor actual y quién lo incrementó.
El programa finalizará cuando la variable alcance un valor determinado (por ejemplo, 20).
*/
public class main {
    public static void main(String[] args) throws InterruptedException {
        contador cont = new contador(100);
        par a = new par(cont);
        impar b = new impar(cont);
        a.start();
        b.start();
    }
}
