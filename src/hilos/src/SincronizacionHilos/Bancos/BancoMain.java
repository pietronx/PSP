package SincronizacionHilos.Bancos;
/*
Se define la clase Cuenta, con atributos saldo y numero_reintegros. Tiene tres métodos:

- Devolver el valor del saldo.
- Restar al saldo una cantidad.
- Comprobar que el saldo sea >= que la cantidad que se quiere retirar.

Se define la clase Cliente, con atributos cuenta, nombre, cantidad y total,
que retire cantidades de dinero periódicas cada 50 ms. Dicha cantidad se indicará al crear al cliente.

El cliente seguirá retirando dinero mientras sea posible (mientras tenga saldo disponible),
guardando el total de dinero retirado.

Desarrollar la clase Banco que en su metodo main() cree una cuenta con un saldo de 1000 € y dos clientes que actúen
sobre la misma cuenta.
Uno de ellos obtiene reintegros de 55 € y otro de 25 €.
Al final se deberá mostrar el dinero que ha sacado cada cliente y el saldo restante en la cuenta.
De esta forma se comprueba si las actualizaciones de la cuenta se han realizado de manera adecuada.

Realiza pruebas con distintos reintegros de los clientes, y distintos saldos iniciales de la cuenta.
 */
public class BancoMain {
    public static void main(String[] args) throws InterruptedException {

        // Creamos la cuenta y establecemos el dinero que hay en ella
        Cuenta bbva = new Cuenta(1000.0);

        // Creamos los clientes, le damos nombre, y hacemos que retiren de la cuenta X cantidad de dinero
        Cliente cliente1 = new Cliente("Fernanda", bbva, 55);
        Cliente cliente2 = new Cliente("Pepa", bbva, 25);

        Thread hilo1 = new Thread(cliente1);
        Thread hilo2 = new Thread(cliente2);
        // Forma en una línea: Thread hilo2 = new Thread(new Cliente("Laura",cuenta,77));

        hilo1.start();
        hilo2.start();
        hilo2.join();

        // Numero de reintegros
        System.out.println("Ha habido: " + bbva.getNumeroReintegros() + " reintegros del BBVA (veces que se ha retirado dinero).");
    }
}
