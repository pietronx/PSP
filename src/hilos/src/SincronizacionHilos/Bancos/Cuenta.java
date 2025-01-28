package SincronizacionHilos.Bancos;

public class Cuenta {
    private double saldo;
    private int numeroReintegros; // Veces que hemos sacado dinero

    // Constructor
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial; // Dinero que hay en la cuenta
        this.numeroReintegros = 0;
    }

    //----------------Métodos----------------\\

    // Comprobar el dinero que hay en la cuenta
    synchronized public double getSaldo() {
        return saldo;
    }

    // Comprobar si el saldo en la cuenta es mayor o igual a la cantidad que queremos retirar
    synchronized public boolean comprobarSaldo(double cantidad) {
        return saldo >= cantidad;
    }

    // Es un booleano que permite o no sacar dinero.
    synchronized public boolean restarSaldo(double cantidad) {
        // Sacar dinero
        if (comprobarSaldo(cantidad)) {
            saldo = saldo - cantidad;
            // Reintegro: Tomar fondos disponibles que tienes en tu cuenta y entregártelos en efectivo (sacar dinero)
            // Un reintegro quiere decir, que has sacado dinero una vez.
            numeroReintegros++;
            // Se puede retirar dinero
            return true;
        } else {
            // No se puede retirar dinero
            return false;
        }
    }
    public int getNumeroReintegros(){
        return numeroReintegros;
    }
}