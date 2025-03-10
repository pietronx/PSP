package SincronizacionHilos.almacenes;

import java.util.ArrayList;
import java.util.Arrays;

/*
En unos grandes almacenes hay 300 clientes agolpados en la puerta para intentar conseguir un producto
del cual solo hay 100 unidades.
Por la puerta solo cabe una persona, pero la paciencia de los clientes es limitada
por lo que solo se harán un máximo de 10 intentos para entrar por la puerta.
Si después de 10 intentos la puerta no se ha encontrado libre ni una sola vez,
el cliente desiste y se marcha.
Cuando se consigue entrar por la puerta el cliente puede encontrarse con dos situaciones:

- Quedan productos: el cliente cogerá uno y se marchará.
- No quedan productos: el cliente simplemente se marchará.
*/
public class grandesAlmacenesMain {
    public static void main(String[] args) {

        final int n_clientes = 300;
        final int n_productos = 100;

        almacen almacen = new almacen(n_productos);
        puerta puerta = new puerta();

        ArrayList<Thread> clientes = new ArrayList<>();

        for (int i = 1; i <= n_clientes; i++) {
            Thread cliente = new cliente(puerta, almacen, "#" + i);
            clientes.add(cliente);
        }

        for (Thread cliente: clientes){
            cliente.start();
        }
        
    }
}