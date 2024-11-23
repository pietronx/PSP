//* Programa el cual le das 3 países y te da sus capitales con un lanzador
package TareasPorTeclado;
import java.util.*;
public class capitales {
	public static void main(String[] args) {
	
		// Declaramos las variables
		String pais="" , capital="";
	
		// Iniciamos el Scanner, y leemos las variables introducidas
		Scanner sc = new Scanner(System.in);
		pais = sc.nextLine();
		
		// Hacemos muchos if else (swicth) con 3 casos para 3 países
		switch(pais)
		{
		case "Espanha":
			capital="Madrid";
			break;
		
		case "Venezuela":
			capital="Caracas";
			break;
			
		case "El Congo":
			capital="Kinshasa";
			break;
			default :	System.out.println("no esta en la base de datos");
		}
		System.out.println(capital);
		sc.close();
	}
}