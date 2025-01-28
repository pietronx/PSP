package SincronizacionHilos.ejercicios02.EjCero;

public class main {
    public static void main(String[] args) {
        contador cont = new contador(0);
        hiloA a = new hiloA("HiloA", cont);
        hiloB b = new hiloB("HiloB", cont);
        a.start();
        b.start();
    }
}