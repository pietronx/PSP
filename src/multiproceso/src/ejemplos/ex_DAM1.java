// Programa ejemplo de un examen de 1º de DAM

package ejemplos;
import java.util.*;
public class ex_DAM1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean bloqueo = false;

        do
        {
            System.out.println("Bienvenid@ al Sistema de la ANC");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Cifrar un Mensaje (Cifrado César)");
            System.out.println("3. Generar una Contraseña Segura");
            System.out.println("4. Informe de actividades sospechosas");
            System.out.println("5. Salir");

            System.out.print("> ");

            opcion = leer.nextInt();
            leer.nextLine();	// Limpiar buffer

            switch(opcion)
            {
                case 1:
                    final String contrasenaCorrecta = "D6a1M24";
                    int intentos = 3;

                    while (intentos > 0) {
                        System.out.print("Introduce la contraseña: ");
                        String contrasena = leer.nextLine();

                        if (contrasena.equals(contrasenaCorrecta)) {
                            System.out.println("¡Bienvenido al sistema!");
                            break;
                        } else
                        {
                            System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
                            intentos--;
                        }
                    }

                    bloqueo=true;
                    System.out.println("Acceso bloqueado. Contacte con el administrador.");

                    break;

                case 2:

                    String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String textoCodificado="";
                    System.out.println("Introduce el texto a encriptar");
                    String texto = leer.nextLine();
                    System.out.println("Introdyce la clave");
                    int desplazamiento = leer.nextInt();
                    texto = texto.toUpperCase();
                    char caracter;

                    for(int i=0 ; i<texto.length() ; i++)
                    {
                        caracter=texto.charAt(i);
                        int pos = letras.indexOf(caracter);

                        if(pos==i)
                        {
                            textoCodificado+=caracter;
                        }
                        else
                        {
                            textoCodificado+=letras.charAt((pos+desplazamiento)%letras.length());
                        }
                    }
                    System.out.println("El mensaje cifrado: " + textoCodificado);
                    System.out.println("");

                    break;

                case 3:
                    System.err.println("Función en Desarrollo \nVuelva más tarde");
                    break;

                case 4:
                    System.err.println("Función en Desarrollo \nVuelva más tarde");

                    break;

                case 5:
                    System.out.println("Se ha salido del sistema de manera segura");
                    break;

                default:
                    System.out.println("Opción no válida, Inténtalo de nuevo. ");
            }

        }
        while(opcion!=5 && bloqueo!=true);
        {

        }
        leer.close();
    }
}
