package E08_hiloFichaje;

/*
Crear un programa que permita realizar el fichaje de entrada a los trabajadores de una empresa.
Para ello, al llegar, deberán registrar su nombre y su hora de entrada (datos que se le pedirán al
usuario). Teniendo en cuenta que la hora de entrada es a las 9:00, se les mostrará un mensaje
tras su fichaje indicando si han llegado a tiempo o se han retrasado.
*/

public class fichaje implements Runnable {

    String nombre;
    int hora;

    fichaje(String nombre, int hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    @Override
    public void run() {
        if (hora < 10) {
            System.out.println("Ha fichado a tiempo. Hora: " + hora + ":00");
        } else {
            System.out.println("Ha fichado tarde. Hora: " + hora + ":00");
        }
    }
}
