package TareasPorTeclado;

import java.util.Scanner;

public class mayusculasBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mayus="";
		String minus="";
		
		minus= sc.nextLine();
					
		mayus= minus.toUpperCase(); // Convertir la frase en mayúsculas

		System.out.println(mayus);
		sc.close();
	}
}