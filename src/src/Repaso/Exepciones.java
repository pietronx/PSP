package Repaso;

public class Exepciones {

	public static void main(String[] args) {

		try 
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("Hola");
			System.out.println("Instruccion 1");
			int n = Integer.parseInt("m"); //-> Generamos un Error
			System.out.println(n);
			System.out.println("Instruccion 2");
			System.out.println("Instruccion 3, etc");
			System.out.println("---------------------------------------------------------");

		}
		catch(Exception e)
		{
			System.err.println("Instrucciones a ejecutar cuando se da un error");
			}
		finally{
			System.out.println("---------------------------------------------------------");
			System.out.println("Instrucciones que se ejecutan siempre, haya un error o no");
		}
	}

}
