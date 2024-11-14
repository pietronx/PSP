package ejemplos;//Programa que abra el paint mediante argumentos (Runtime)

import java.io.IOException;

public class ejemplo1 {
	public static void main(String[] args) {

		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(args); 
			/* Process proceso = runtime.exec(args);  
			 * proceso.destroy();*/// --> La variable "destroy", estruye el proceso sobre el que se ejecuta
		} catch (IOException e) {
			System.err.println("Error");
			System.exit(-1);
		}
		
	}
}