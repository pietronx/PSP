package SincronizacionHilos.almacenes;

public class almacen {

    private int n_producto;

    // Constructor
    public almacen(int n_producto) {
        this.n_producto = n_producto;
    }

     boolean cogerProducto() {
        if (n_producto > 0) {
            n_producto--;
            return true; // Se ha cogido un producto
        }
        return false; // No se podido coger un producto
    }
}