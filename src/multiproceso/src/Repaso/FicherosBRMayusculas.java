package Repaso;
import java.io.*;
public class FicherosBRMayusculas
{
	public static void main(String[] args) 
	{

		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("ficheroMayus.txt"));
			BufferedReader br = new BufferedReader(new FileReader("ficheroMayus.txt"));
			bw.write("Esto es una prueba".toUpperCase());
			bw.newLine();
			bw.write("de ficheros".toUpperCase());
			bw.newLine();
			bw.write("en mayusculas".toUpperCase());
			bw.close();
			
			String linea = br.readLine();
			while(linea !=null) // Va a leer lineas hasta que dejen de haber datos
			{
				linea = linea.toUpperCase();
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