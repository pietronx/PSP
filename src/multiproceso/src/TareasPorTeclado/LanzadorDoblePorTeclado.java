package TareasPorTeclado;

import java.io.*;
import java.util.Scanner;

public class LanzadorDoblePorTeclado {
    public static void main(String[] args) {

        try {
            ProcessBuilder pb = new ProcessBuilder(args);
            Process proceso = pb.start();

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un Número: ");
            int x = sc.nextInt();

            // Flujo de Salida de Datos (Escribir)
            OutputStream os = proceso.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            PrintWriter pw = new PrintWriter(osw);

            pw.print(x);

            pw.close();
            osw.close();
            os.close();

            // Flujo de Entrada de Datos (Leer)
            InputStream is = proceso.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();
            isr.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
