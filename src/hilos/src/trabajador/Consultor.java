package trabajador;

public class Consultor extends Trabajador
{

    private final int horas;
    private final double tarifa;

    public Consultor(String nombre, String NSS,int horas,double tarifa)
    {
        super(nombre, NSS);
        this.horas = horas;
        this.tarifa = tarifa;

    }

    public double calcularPaga() {
        return super.calcularPaga();
    }
    public String toString(){
        return "Consultor "+super.toString();
    }
}
