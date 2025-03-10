package Repaso;

public class GestionPersonas {
    public static void main(String[] args)
    {
        Persona per1 = new Persona("Pepe",29,"pepe@gmail.com");
        Persona per2 = new Persona("Juan","juan@gmail.com");
        Persona per4 = new Persona("Pedro","pedro@gmail.com");

        // Mostramos la info de las dos personas
        per1.mostrarInfo();
        System.out.println();
        per2.mostrarInfo();
        System.out.println();

        // Juan cumple años y lo mostramos
        per2.cumplirAnhos();
        per2.mostrarInfo();

        // Hacemos que una tercera persona sea Juan
        Persona per3;
        per3 = per2;

        // Mostramos esa tercera persona
        System.out.println();
        per3.mostrarInfo();
        System.out.println();

        // Juan cumple años de nuevo
        per2.cumplirAnhos();
        per3.mostrarInfo();
        System.out.println();

        // Pepe desaparece, ahora Pepe es Juan
        per1=per3;
        per1.mostrarInfo();

        // -- Persona 4 -- \\
        System.out.println();
        per4.mostrarInfo();
        per4.cumplirAnhos();
    }
}
