package Tareas;
import java.io.*;

public class lanzadorSumador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pb=new ProcessBuilder(args);
		
		Process proceso;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader reader=null;
		
		try {
			proceso=pb.start();
			is=proceso.getInputStream();
			isr=new InputStreamReader(is);
			reader=new BufferedReader(isr);
			
			String linea;
			
			while((linea=reader.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				is.close();
				isr.close();
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
