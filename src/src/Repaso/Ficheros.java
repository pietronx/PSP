package Repaso;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ficheros 
{
	public static void main (String args[]) 
	{
		try 
		{
			// Crear y escribir en un fichero un contenido
			FileWriter f = new FileWriter("hola.txt");
			f.write("Uno");
			f.write("\nDos");
			f.write("\nTres");
			f.close();
			f = new FileWriter("hola.txt", true);
			f.write("\nCuatro");
			f.write("\nCinco");
			f.close();
			
			
			// Sacar por pantalla el contenido del fichero 
			File fichero = new File("hola.txt"); 
			if(!fichero.exists())
			{
			System.out.println("Fichero no encontrado");
			}
			else
			{
				String s;
				Scanner sc = new Scanner(fichero);
				while(sc.hasNext()) 
				{
					s = sc.nextLine();
					System.out.println(s);
				}
				sc.close();
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
