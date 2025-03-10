package ejemplos;

import java.io.IOException;

public class ejemplo7 {

    public static void main(String[] args) throws IOException {



        Process b;
        new ProcessBuilder("Notepad.exe").start();

        new ProcessBuilder("Notepad.exe", "hola.txt").start();

        String linea;
    }
}
