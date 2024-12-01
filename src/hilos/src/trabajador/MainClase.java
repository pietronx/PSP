package trabajador;

import java.util.ArrayList;

public class MainClase
{
    public static void main(String[] args) {


        Trabajador trabajador = new Trabajador("Juan", "456");
        Empleado empleado = new Empleado("Jose", "459", 30000);
        Empleado empleado2 = new Empleado("Agustín", "459", 30000);
        Consultor consultor = new Consultor("Juan", "456", 10, 50);
        Consultor consultor2 = new Consultor("Pepe", "476", 10, 50);
        Trabajador c3= new Consultor( "Pepe","458",85,65);

        System.out.println("\nTrabajadores\n");
        System.out.println(trabajador);
        System.out.println(empleado);
        System.out.println(empleado2);
        System.out.println(consultor);
        System.out.println(consultor2);
        System.out.println(c3);

        System.out.println("\nTrabajador = consultor?\n"+ trabajador.equals(consultor));
        System.out.println("Trabajador = empleado?\n"+trabajador.equals(empleado));

        System.out.println("\nPaga de los trabajadores\n");

        //  Metemos en una lista, todos los trabajadores y calculamos su paga
        ArrayList<Trabajador> trabajadores= new ArrayList<>();

        trabajadores.add(empleado);
        trabajadores.add(empleado2);
        trabajadores.add(consultor);
        trabajadores.add(consultor2);
        trabajadores.add(trabajador);
        trabajadores.add(c3);

        /*
         for(int i=0; i<trabajadores.size();i++)
        {
            System.out.println(trabajadores.get(i).calcularPaga()+"€");
        }
        */
        for (Trabajador t : trabajadores) {
            System.out.println(t.calcularPaga() + "€");
        }

    }

}
