package SincronizacionHilos.ejercicios.EjUno;

public class main {
    public static void main(String[] args) throws InterruptedException {
        contador cont = new contador(100);
        par a = new par(cont);
        impar b = new impar(cont);
        a.start();
        b.start();
    }
}
