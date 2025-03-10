package Excepciones;

public class BancoException {

    public static void main(String[] args) { //-> Nos situamos en el main (el cajero, o banco)

        cuentaCorrienteException c = new cuentaCorrienteException(23009); //--> Creamos una cuenta corriente (el numero es el numero de cuenta)

        c.deposito(5000); //--> deposito esta cantidad de dinero en la cuenta.

        try {
            System.out.println("-100€");        // Retiramos 100€
            c.retiro(100);              // Retiramos 100€ (en lenguaje maquina)
            System.out.println("-7000€");        // Retiramos 7000€
            c.retiro(7000);             // Retiramos 7000€ (en lenguaje maquina)
        } catch (FondosInsuficientesException e) //-> Nos traemos la excepcion de fondos insuficientes
        {
            System.err.println("No puede retirar dinero, dinero insuficiente"); // syso.err para pintar de rojo el mensaje
            e.getMessage(); //--> getMessage(), para solo indicar como error, el mensaje anterior.
            // e.printStackTrace(); //--> printStackTrace, para indicar el error completo de java.
        }
    }
}