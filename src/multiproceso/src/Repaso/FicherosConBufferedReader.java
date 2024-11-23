package Repaso;
import java.io.*;
public class FicherosConBufferedReader 
{
	public static void main(String[] args) 
	{

		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("fichero.txt"));
			BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
			bw.write("Esto es una prueba");
			bw.newLine();
			bw.write("de ficheros");
			bw.close();
			
			
			  String linea = br.readLine(); 
			  while(linea !=null) // Va a leer lineas hasta que dejen de haber datos 
				  { 
				  System.out.println(linea); 
				  linea = br.readLine();
				  } 
			  br.close();
			 
		}
		
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	}

}
