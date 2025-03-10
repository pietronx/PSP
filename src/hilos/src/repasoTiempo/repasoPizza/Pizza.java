package repasoTiempo.repasoPizza;

public class Pizza {
    private static int totalPedidas = 0;// acumulamos el total de pizzas pedidas
    private static int totalServidas = 0;// acumulamos el total de pizzas pedidas
    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public String toString() {
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

    /**
     * Cambia el estado de la pizza de pedida a servida
     * En caso de que la pizza se hubiera servido ya y se intenta servir de nuevo,
     * se muestra el mensaje 'esa pizza ya se ha servido'
     */

    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("Esta pizza ya se ha servido");
        }
    }
}

