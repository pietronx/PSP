package Tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class lanzadorSumador {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder(args);

        Process proceso;
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader reader = null;

        try {
            proceso = pb.start();
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            reader = new BufferedReader(isr);

            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            try {
                is.close();
                isr.close();
                reader.close();
            } catch (IOException e) {

                e.printStackTrace();
            }

        }
    }

}
