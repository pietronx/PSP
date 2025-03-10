import java.net.InetAddress;
import java.net.UnknownHostException;

public class distintosHosts {
    public static void main(String[] args) {
        InetAddress dir = null;
//Pasamos los métodos a diferentes direcciones a ver qué sale
        /* Los métodos getLocalHost y getByName devuelven instancias
         * de InetAddress */
        System.out.println("\nSalida para LOCALHOST");
        try {
            dir = InetAddress.getLocalHost();
            pruebaMetodos(dir);
            //System.out.println("\nSalida para un nombre de equipo");
            //dir = InetAddress.getByName("DESKTOP-54M7DNL");
            pruebaMetodos(dir);
            System.out.println("\nSalida para GOOGLE");
            dir = InetAddress.getByName("www.googe.es");
            pruebaMetodos(dir);
            System.out.println("\nSalida para madrid org");
            dir = InetAddress.getByName("www.madrid.org");
            pruebaMetodos(dir);
        } catch (UnknownHostException e) {
        }
    }//main

    private static void pruebaMetodos(InetAddress dir) {
// los demás métodos devuelven Strings
        System.out.println("\tMétodo getByName(): " + dir);
        System.out.println("\tMétodo getHostName(): "+dir.getHostName());
                System.out.println("\tMétodo toString(): " + dir.toString());
        System.out.println("\tMétodo getCanonicalHostName(): "+dir.getCanonicalHostName());
    }
}//class
