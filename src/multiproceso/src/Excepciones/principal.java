package Excepciones;

public class principal {

	public static void main(String[] args) {
	
		try {
			persona persona = new persona();
			persona.setEdad(-9);	
		}
		catch(RuntimeException e)
		{
			System.err.println(e.getMessage());
		}
	}
}