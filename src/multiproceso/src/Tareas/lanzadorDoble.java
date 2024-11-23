package Tareas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class lanzadorDoble {
	public static void main(String[] args) {

		try {
			
		//Se crea un proceso hijo, que le pasara por los argumentos del main (y ese proceso hijo sera la llamada a doble.jar)
		//java-jar ruta programa.jar argumentos
			ProcessBuilder pb=new ProcessBuilder(args);
			
			//ejecuto el proceso creado anteriormente
			Process proceso=pb.start();
			
			
			//Con el metodo getInputStream estamos leyendo la salida est�ndar del hijo
			InputStream is=proceso.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}