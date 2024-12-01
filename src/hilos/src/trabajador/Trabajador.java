package trabajador;

import java.util.Date;

public class Trabajador {
    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private Date fecha_nac;
    private Date fecha_contrat;
    private String NSS; // Numero seguridad social


//  Constructor

    public Trabajador(String nombre, String NSS) {
        this.nombre = nombre;
        this.NSS = NSS;
    }

    //  get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public Date getFecha_contrat() {
        return fecha_contrat;
    }

    public void setFecha_contrat(Date fecha_contrat) {
        this.fecha_contrat = fecha_contrat;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    //  Comparación de objetos

    public boolean equals(Trabajador trabajador) {
        return this.NSS.equals((trabajador.NSS));
    }

    // Lo usamos para imprimir los objetos sin tener que mencionar directamente el metodo
    public String toString() {
        return nombre + " " + NSS;
    }

    public double calcularPaga() {
        return 0;
    }
}
