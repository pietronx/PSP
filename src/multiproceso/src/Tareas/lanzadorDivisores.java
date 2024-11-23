package Tareas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class lanzadorDivisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProcessBuilder pb=new ProcessBuilder(args);
			Process proceso=pb.start();
			
			//Recojo la informacion del hijo
			InputStream is=proceso.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			String linea=br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
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
