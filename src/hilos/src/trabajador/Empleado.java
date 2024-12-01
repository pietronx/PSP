package trabajador;

public class Empleado extends Trabajador{

    private double sueldo;
    private double impuestos;

    private final int PAGAS = 14;



    public Empleado(String nombre,String NSS,double sueldo)
    {
        super(nombre,NSS);
        this.sueldo = sueldo;
        this.impuestos = 0.3*sueldo;
    }

    public double calcularPaga() {
        return (sueldo-impuestos)/PAGAS;
    }

    @Override
    public String toString() {
        return "Empleado " + super.toString();
    }
}
