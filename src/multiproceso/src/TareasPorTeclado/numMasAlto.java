/*
 *Programa que pida al usuario meter varios números, y que el programa te diga el número mas alto. Se detiene cuando pones cero (0)
 */

package TareasPorTeclado;
import java.util.*;
public class numMasAlto 
{
	public static void main (String[] args) 
	{
		
		// Declaramos las variables
		int n;		// numeros recogidos
		int max;	// valor maximo
		
		// Creamos una lista de arrays llamada nums para guardar los numeros introducidos
		ArrayList<Integer> nums = new ArrayList<>();
		// Iniciamos el scanner
		Scanner sc = new Scanner(System.in);		
		n = sc.nextInt(); // Leemos el primer valor introducido
		
		while(n!=0) // Iniciamos el bucle para leer y añadir numeros
		{
			nums.add(n);		// Los añadios a la lista
			n = sc.nextInt();	// Leemos los numeros

		}

		// Luego de finalizar el bucle encotramos el valor maximo en toda la lista con la funcion Collections.
		max = Collections.max(nums);

		// Lo imprimimos por pantalla
		System.out.println("Valor maximo: "+ max);

		sc.close(); // Cerramos el scanner
	}
}