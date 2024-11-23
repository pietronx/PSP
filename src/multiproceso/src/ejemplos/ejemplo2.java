package ejemplos;/*
 * Programa que abra 3 blocs de notas mediante el uso de comillas "Notepad.exe"(ProcessBuilder)
 */

import java.io.IOException;

public class ejemplo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe");
		for (int i = 0; i < 3; i++) {
			try {
				pBuilder.start();
			} catch (IOException e) {
				e.printStackTrace(); // Esto lo que hace es que se imprime la excepción, en caso de haber una
			}
		}
	}
}