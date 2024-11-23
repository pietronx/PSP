package Repaso;

public class Persona {

    private String nombre;
    private int edad = 18;
    private String email;
    private Direccion domicilio;

    // Constructor 1
    public Persona(String nombre, int edad, String email) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public Persona(String nombre, String email)
    {
        this.nombre = nombre;
        this.email = email;
    }

    // Constructor 2
    public Persona(String nombre, int edad, String email, Direccion domicilio) {
        this(nombre, edad, email);
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public int cumplirAnhos()
    {
        setEdad(getEdad()+1); //edad++;
        return edad;
    }

    public void mostrarInfo()
    {
        System.out.println(nombre + " " + edad + " " + email + " ");
    }

}
