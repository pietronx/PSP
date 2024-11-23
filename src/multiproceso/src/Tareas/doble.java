/*
* Escribe un programa que pida un número y escriba el doble de ese numero (sin utiliza scanner)
*/

package Tareas;

public class doble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("no hay parámetros");
		}
		int num, doble;

		num = Integer.parseInt(args[0]);
		doble = num * 2;
		System.out.println("El doble de " + num + " es " + doble);

	}

}