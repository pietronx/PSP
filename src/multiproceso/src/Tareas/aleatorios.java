/*Cree un proceso hijo que esté encargado de generar números aleatorios.
 * 
• Este proceso hijo escribirá en su salida estándar un número aleatorio del 0 al 10 cada
vez que reciba una petición de ejecución por parte del padre. Solamente crearemos un
ejecutable y lo llamaremos correctamente desde Java.

• El proceso padre lee líneas de la entrada estándar y por cada línea que lea solicitará al
hijo que le envíe un número aleatorio, lo leerá y lo imprimirá en pantalla.

• Cuando el proceso padre reciba la palabra “fin”, finalizará la ejecución del hijo y
procederá a finalizar su ejecución.*/

package Tareas;
import java.util.Random;
public class aleatorios {
	
	public static void main(String[] args) {
		
	       Random random = new Random();
	       random.nextInt(); // Números aleatorios entre 0 y 10 
	       
	       System.out.println("El numero aleatorio es: " + new Random().nextInt(11));
	       
	        }	    
	}

