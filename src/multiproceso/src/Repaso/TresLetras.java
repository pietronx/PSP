/*Pedir al usuario nombre, apellido1 y apellido2 & devolver 3 primeras letras de estos 3*/
package Repaso;
import java.util.*;
public class TresLetras {

	public static void main(String[] args) {
		
		//Declaramos las variables
		String nombre;
		String apellid1;
		String apellid2;
		
		//Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos los datos y los leemos
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduce tu primer apellido: ");
		apellid1 = sc.nextLine();
		
		System.out.println("Introduce tu segundo apellido: ");
		apellid2 = sc.nextLine();
		
		// Transformamos el resultado en mayusculas
		nombre = nombre.toUpperCase();
		apellid1 = apellid1.toUpperCase();
		apellid2 = apellid2.toUpperCase();

		// Imprimimos el resultado
		System.out.println(nombre.substring(0,3)); // ".substring(0,3)" --> Los primeros tres caracteres leidos
		System.out.println(apellid1.substring(0,3));
		System.out.println(apellid2.substring(0,3));
		
		//Cerramos el Scanner
		sc.close();
	}

}
