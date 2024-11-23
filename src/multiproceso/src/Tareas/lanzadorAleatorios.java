// Programa Lanzador de aleatorios.java
package Tareas;
import java.util.*;
import java.io.*;
public class lanzadorAleatorios {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			String entrada = "";
			
			while (entrada!=null) {
			  Process process = new ProcessBuilder(args).start();
			  InputStream is = process.getInputStream();
	          InputStreamReader isr = new InputStreamReader(is);
	          BufferedReader br = new BufferedReader(isr);
	          
	          String line;
	          
	          line = br.readLine();
	          System.out.println(line);
	          br.close();
	          System.out.println("Presione Enter para generar otro número o fin para terminar ");
	          entrada=sc.nextLine();
	          
	        if (entrada.equals("fin")) {
	        	System.out.println("Proceso finalizado.");
	        	entrada=null;
	        	process.destroy();
	        }
	        
	        br.close();
            isr.close();
            is.close();
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}