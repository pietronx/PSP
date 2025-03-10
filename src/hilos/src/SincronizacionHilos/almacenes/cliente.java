package SincronizacionHilos.almacenes;

import java.util.Random;

public class cliente extends Thread {

    private final puerta puerta;
    private final almacen almacen;
    private final String nombre;
    private final Random random;
    private final int MAX_INTENTOS = 10;

    public cliente(puerta puerta, almacen almacen, String nombre) {
        this.puerta = puerta;
        this.almacen = almacen;
        this.nombre = nombre;
        random = new Random();
    }

    public void esperar(int tiempoMaximo){
        int tiempoEspera = random.nextInt(tiempoMaximo); // Ponemos nosotros el tiempo de espera
        try {
            sleep(tiempoEspera);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_INTENTOS; i++) {
            esperar(2000);
            if (puerta.intentarEntrar()) {
                boolean productoRecogido = almacen.cogerProducto();
                esperar(100);
                puerta.liberarPuerta();
                if (productoRecogido) {
                    System.out.println("Cliente " + nombre + " ha cogido un producto");
                    return;
                }
                System.out.println("Cliente " +nombre+ " no ha podido coger producto");
                return;
            }
        }
        System.out.println("Cliente " + nombre + " no ha podido entrar y se ha marchado");
    }
}