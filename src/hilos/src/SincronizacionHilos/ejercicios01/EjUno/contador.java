package SincronizacionHilos.ejercicios01.EjUno;

public class contador {

    private int c = 0;
    contador (int c){
        this.c = c;
    }
    synchronized public void incrementar() {
        c = c + 1;
    }
    synchronized public int getValor(){
        return c;
    }
}
