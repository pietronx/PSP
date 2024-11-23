package Tareas;

public class TareaSuma {

	public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Se necesitan dos números para realizar la suma.");
            System.exit(1);
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int suma = n1 + n2;
            System.out.println("La suma es: " + suma);
        } catch (NumberFormatException e) {
            System.err.println("Los argumentos deben ser números enteros.");
        }
    }
}