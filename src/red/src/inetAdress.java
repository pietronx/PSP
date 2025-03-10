import java.net.InetAddress;
import java.net.UnknownHostException;
public class inetAdress {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress host = InetAddress.getByName("www.google.es");
        System.out.println("Host con tipo InetAddres: "+host);
        System.out.println("IP: "+ host.getHostAddress());
        System.out.println("Nombre: "+host.getHostName());
        System.out.println("Canonical Nombre: "+host.getCanonicalHostName());
        System.out.println("Host con tipo toString: "+host.toString());

        InetAddress[] dirs= InetAddress.getAllByName("www.google.es");
        //for(InetAddress ia: dirs) System.out.println(ia); //es el mismo bucle que abajo.
        //Devuelve todas las direcciones de un hosts
        for (int i = 0; i < dirs.length; i++)
        {
            System.out.println("posicion " + i + " de AllByName : " + dirs[i]);
        }

    }

}