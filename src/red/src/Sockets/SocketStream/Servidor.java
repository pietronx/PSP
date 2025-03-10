package Sockets.SocketStream;
import java.io.*;
import java.net.*;

public class Servidor {
	public static final int PORT = 6666;

	public static void main(String[] args) throws IOException {
		// Establece el puerto en el que escucha peticiones
		ServerSocket socketServidor = null;
		try {
			socketServidor = new ServerSocket(PORT);
		} catch (IOException e) {
			System.out.println("No puede escuchar en el puerto: " + PORT);
			System.exit(-1);
		}

		Socket socketCliente = null;
		BufferedReader entrada = null;
		PrintWriter salida = null;

		System.out.println("Escuchando: " + socketServidor);
		try {
			// Se bloquea hasta que recibe alguna petici�n de un cliente
			// abriendo un socket para el cliente
			socketCliente = socketServidor.accept();
			System.out.println("Connexi�n acceptada: " + socketCliente);
			// Establece canal de entrada
			entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
			// Establece canal de salida
			salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketCliente.getOutputStream())), true);

			// Hace eco de lo que le proporciona el cliente, hasta que recibe "Adios"
			String str = entrada.readLine();
			while (!str.equals("Adios")) {
				
				System.out.println("Cliente: " + str);
				salida.println(str);
				str = entrada.readLine();
//				if (str.equals("Adios"))
//					break;
			}

		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		salida.close();
		entrada.close();
		socketCliente.close();
		socketServidor.close();
	}
}