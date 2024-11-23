/*
 * Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o no 
 * (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas)
*/

package Repaso;
import java.util.*;
public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;
		boolean palindromo = true;
		
		
		System.out.println("Introduzca un palindromo: ");
		
		frase= sc.nextLine();
		frase = frase.replace("","");
		frase = frase.toUpperCase();
		int longitud = frase.length();
		
		for (int i = 0; i < longitud && palindromo; i++) {
			if(frase.charAt(i) != frase.charAt((longitud - 1) -i)){
				palindromo = false;
				}
		}
		
		if (palindromo) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		sc.close();
	}

}
