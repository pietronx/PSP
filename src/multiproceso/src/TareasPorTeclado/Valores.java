/*
 * 6. Escribe un programa que vaya solicitando valores al usuario. Un programa hijo se encargará de
 * mostrar la media una vez que haya terminado. Será el valor 0 quien indique fin de secuencia.
*/

package TareasPorTeclado;
import java.util.*;
public class Valores {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<>();
		
		int valor;
		valor = sc.nextInt();

		
		while(valor!=0) {
			valores.add(valor);
			
			valor = sc.nextInt();
		}
		
		int suma = 0;
		for(int num : valores) {
			suma += num;
		}
		
		double media = (double) suma / valores.size();
		System.out.println("La media es: " + media);
		
		sc.close();
	}
}		