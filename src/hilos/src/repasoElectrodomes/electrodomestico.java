package repasoElectrodomes;

public class electrodomestico {

    private String tipo;
    private String marca;
    private double potencia;

    // Constuctor
    public electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "El tipo: " + getTipo() + "\nLa marca: " + getMarca() + "\nLa potencia: " + getPotencia();
    }

    public double getConsumo(int horas) {
        return potencia * horas;
    }

    public double getCosteConsumo(double precio, int horas) {
        return precio * getConsumo(horas);
    }
}