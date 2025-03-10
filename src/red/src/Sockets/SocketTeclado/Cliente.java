package Sockets.SocketTeclado;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        try {
            System.out.println("Creando socket cliente");
            Socket clientSocket = new Socket();
            System.out.println("Estableciendo conexión");
            InetSocketAddress addr = new InetSocketAddress("Localhost", 5555);
            clientSocket.connect(addr);

            //InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca su mensaje");
            String mensaje;
            mensaje = sc.nextLine();

            System.out.println("Enviando mensaje");

            os.write(mensaje.getBytes());

            System.out.println("Mensaje enviado");
            System.out.println("Cerrando socket cliente");
            clientSocket.close();
            System.out.println("Terminado");


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
