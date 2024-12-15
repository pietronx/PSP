package E10_hiloEstaciones;

/*
Crear un programa que tenga almacenadas las estaciones del año en un array. El usuario pasará
una de las 4 estaciones, y en función de la elegida, se mostrarán los meses que le corresponden,
con una escala de tiempo entre ellos.
*/
public class estaciones implements Runnable {

    // Arrays con los meses de cada estación
    String[] invierno = {"Diciembre", "Enero", "Febrero"};
    String[] primavera = {"Marzo", "Abril", "Mayo"};
    String[] verano = {"Junio", "Julio", "Agosto"};
    String[] otoño = {"Septiembre", "Octubre", "Noviembre"};

    String estacion;
    String[] meses;

    // Constructor para inicializar la estación y los meses
    public estaciones(String estacion) {
        this.estacion = estacion;
        this.meses = obtenerMeses(estacion);
    }

    // Metodo para obtener los meses según la estación
    public String[] obtenerMeses(String estacion) {

        switch (estacion) {
            case "Invierno":
                return invierno;
            case "Primavera":
                return primavera;
            case "Verano":
                return verano;
            case "Otoño":
                return otoño;
            default:
                return null; // Si la estación no es válida
        }
    }

    @Override
    public void run() {
        System.out.println("Meses de la estación " + estacion + ":");
        // Recorre el array meses
        for (int i = 0; i < meses.length; i++) {
            // Imprimimos el mes
            System.out.println(meses[i]);
        }
    }
}