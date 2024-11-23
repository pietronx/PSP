package Tareas;

public class sumaDosNum {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("no hay parámetros");
		}
		int num1, num2, suma;

		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		suma = 0;
		// suma = num1 + num2;
		for (int i = num1; i <= num2; i++) {
			suma += i;
		}
		System.out.println("La suma de " + num1 + " + " + num2 + " es = " + suma);

	}

}
