package SincronizacionHilos.Bancos;

public class Cliente implements Runnable {
    private final Cuenta cuenta;
    private final String nombre;
    private final double cantidad; // Dinero que retiramos de la cuenta
    private double total; // Total de dinero retirado en todos los reintegros

    // Constructor
    public Cliente(String nombre, Cuenta cuenta, double cantidad) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.cantidad = cantidad;
        this.total = 0;
    }

    @Override
    public void run() {

        // Bucle para que el cliente retire tanto como sea posible
        while (cuenta.comprobarSaldo(cantidad)) {
            // Si se puede sacar dinero...
            if (cuenta.restarSaldo(cantidad)) {
                // ... Se añade el dinero a la cantidad total retirada
                total = total + cantidad;
                System.out.println(nombre + " retiró " + cantidad + ".\nSaldo restante: " + cuenta.getSaldo());
            } else {
                System.out.println(nombre + " no pudo retirar " + cantidad + "\n. Saldo insuficiente.");
            }
            // Tiempo entre retirada y retirada
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(nombre + " fue interrumpido.");
            }
        }
        System.out.println(nombre + " ha terminado de retirar dinero.\nTotal retirado de: "+ nombre +" "+ total);
    }
}