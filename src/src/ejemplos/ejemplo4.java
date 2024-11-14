package ejemplos;/*Programa que te de por pantalla el numero de procesadores que tiene tu ordenador
 * Mediante el uso de ProcessBuilder
 */

import java.io.IOException;

public class ejemplo4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe", "datos.exe");
		java.util.Map<String, String> env = pBuilder.environment();
		System.out.println("Número de procesadores: " + env.get("NUMBER_OF_PROCESSORS"));
	}
}