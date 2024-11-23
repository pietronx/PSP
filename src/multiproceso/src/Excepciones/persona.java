package Excepciones;

public class persona {

	private int edad;
	public int getEdad() 
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		if(edad < 0) {
			throw new RuntimeException("La edad debe ser positiva");
		}
		this.edad = edad;
	}
}
