/*
Crea un programa por el cual, escribas una frase en minusculas y te lo dé en mayúsculas.
*/
package TareasPorTeclado;
import java.util.Scanner;
public class mayusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String minus=sc.nextLine();
		
		String mayus= minus.toUpperCase(); // Convertir la frase en mayúsculas
		
		System.out.println(mayus);

		sc.close();
	}

}