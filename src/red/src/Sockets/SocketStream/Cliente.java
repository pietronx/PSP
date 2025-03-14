package Sockets.SocketStream;

import java.net.*;
import java.io.*;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Socket socketCliente = null;
		BufferedReader entrada = null;
		PrintWriter salida = null;

		// Creamos un socket en el lado cliente, enlazado con un
		// servidor que est� en la misma m�quina que el cliente
		// y que escucha en el puerto 4444
		try {
			socketCliente = new Socket("172.168.0.115", 4444);
			// Obtenemos el canal de entrada
			entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
			// Obtenemos el canal de salida
			salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketCliente.getOutputStream())), true);
		} catch (IOException e) {
			System.err.println("No puede establer canales de E/S para la conexi�n");
			System.exit(-1);
		}
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String linea;
		// El programa cliente no analiza los mensajes enviados por el
		// usario, simplemente los reenv�a al servidor hasta que este
		// se despide con "Adios"

		try {
			while (true) {
				// Leo la entrada del usuario
				linea = stdIn.readLine();
				// La envia al servidor
				salida.println(linea);
				// Env�a a la salida est�ndar la respuesta del servidor
				linea = entrada.readLine();
				System.out.println("Respuesta servidor: " + linea);
				// Si es "Adios" es que finaliza la comunicaci�n
				if (linea.equals("Adios"))
					break;
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

		// Libera recursos
		salida.close();
		entrada.close();
		stdIn.close();
		socketCliente.close();
	}
}