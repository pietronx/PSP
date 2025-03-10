package Tareas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TareaLanzadorSuma {
    static java.util.List<String> comando;

    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Debes pasar el número de veces que se hará la suma.");
            System.exit(1);
        }

        int veces = 0;
        try {
            veces = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("El argumento debe ser un número entero.");
            System.exit(1);
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= veces; i++) {
            System.out.println("Suma " + i + ":");
            System.out.print("Introduce el primer número: ");
            int n1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            int n2 = sc.nextInt();

            File ficheroSalida = new File("P1resultado" + i + ".txt");
            File ficheroErrores = new File("P1errores.txt");

            ProcessBuilder pb = new ProcessBuilder("java", "suma.Suma", String.valueOf(n1), String.valueOf(n2));
            pb.redirectOutput(ficheroSalida);
            pb.redirectError(ficheroErrores);
            comando = pb.command();

            try {
                Process p = pb.start();
                p.waitFor();
                System.out.println("Proceso " + i + " finalizado. Verifica P1resultado" + i + ".txt para el resultado.");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}