import java.net.InetAddress;
import java.net.UnknownHostException;

public class obtenerInfoMaquina {
    public static void main(String[] args) {
        InetAddress dir;
        try {
            dir = InetAddress.getLocalHost();
            //getByName y getAllByName piden un String
            InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
            for (InetAddress ia : direcciones)
                System.out.println(ia);
        } catch (UnknownHostException e) {
        }
    }//main
}//class

