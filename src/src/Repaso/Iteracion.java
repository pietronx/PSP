package Repaso;
import java.util.*;
public class Iteracion {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		
		for(int i = 1; i <= 10; i++) 
		{
			nombres.add("Elemento " + i);
		}
		
		Iterator<String> nombreIterator = nombres.iterator(); // Iterator recorre el arraylist  
	
		while (nombreIterator.hasNext()) // hasnext: Verifica si hay más elementos disponibles
		{
			String elemento = nombreIterator.next();
			System.out.println(elemento);
		}
	
	}

}