package ExamenEV1;
import java.util.*;

public class Ex_Dam1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario.
        int opcion; // Variable para almacenar la opción del menú seleccionada.
        boolean bloqueo = false; // Variable para indicar si el acceso está bloqueado.

        // Bucle principal del menú
        do {
            System.out.println("Bienvenid@ al Sistema de la ANC");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Cifrar un Mensaje (Cifrado César)");
            System.out.println("3. Generar una Contraseña Segura");
            System.out.println("4. Informe de actividades sospechosas");
            System.out.println("5. Salir");

            System.out.print("> ");

            opcion = leer.nextInt(); // Lee la opción del usuario.
            leer.nextLine(); // Limpia el buffer después de leer un número.

            switch (opcion) {
                case 1:
                    final String contrasenaCorrecta = "D6a1M24"; // Contraseña correcta predefinida.
                    int intentos = 3; // Número de intentos permitidos.

                    while (intentos > 0) {
                        System.out.print("Introduce la contraseña: ");
                        String contrasena = leer.nextLine(); // Lee la contraseña ingresada.

                        if (contrasena.equals(contrasenaCorrecta)) { // Verifica si es correcta.
                            System.out.println("¡Bienvenido al sistema!");
                            break;
                        } else {
                            System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
                            intentos--; // Disminuye el número de intentos.
                        }
                    }

                    bloqueo = true; // Bloquea el acceso si se agotan los intentos.
                    System.out.println("Acceso bloqueado. Contacte con el administrador.");
                    break;

                case 2:
                    String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Alfabeto para cifrado.
                    String textoCodificado = ""; // Cadena para el texto cifrado.
                    System.out.println("Introduce el texto a encriptar");
                    String texto = leer.nextLine(); // Lee el texto a cifrar.
                    System.out.println("Introduce la clave");
                    int desplazamiento = leer.nextInt(); // Lee el desplazamiento para el cifrado.
                    texto = texto.toUpperCase(); // Convierte el texto a mayúsculas.
                    char caracter;

                    // Bucle para cifrar cada carácter del texto.
                    for (int i = 0; i < texto.length(); i++) {
                        caracter = texto.charAt(i);
                        int pos = letras.indexOf(caracter); // Encuentra la posición del carácter en el alfabeto.

                        if (pos == i) {
                            textoCodificado += caracter; // Si es un carácter especial o espacio, se mantiene igual.
                        } else {
                            textoCodificado += letras.charAt((pos + desplazamiento) % letras.length());
                        }
                    }
                    System.out.println("El mensaje cifrado: " + textoCodificado);
                    System.out.println("----------------------------------------");
                    break;

                case 3:
                    String contrasena = ""; // Variable para la contraseña generada.
                    System.out.println("Introduce la longitud de la contraseña (8-20): ");
                    int longitud = leer.nextInt(); // Longitud deseada para la contraseña.

                    if (longitud < 8 || longitud > 20) { // Verifica si la longitud es válida.
                        System.out.println("Longitud no válida");
                        break;
                    }

                    String mayusMinus = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
                    String numeros = "0123456789";

                    // Genera caracteres especiales aleatorios.
                    String especiales = "";
                    for (int i = 0; i < longitud; i++) {
                        especiales += generarCaracterEspecialAleatorio();
                    }

                    // Selecciona al azar letras, números y caracteres especiales.
                    int letra = (int) (Math.random() * mayusMinus.length());
                    int numero = (int) (Math.random() * numeros.length());
                    int especial = (int) (Math.random() * especiales.length());

                    contrasena = "" + mayusMinus.charAt(letra) + numeros.charAt(numero) + especiales.charAt(especial);
                    contrasena = contrasena.toUpperCase();

                    String todosCaracteres = mayusMinus + numeros + especiales;

                    // Completa la contraseña con más caracteres aleatorios hasta alcanzar la longitud deseada.
                    for (int i = 3; i < longitud; i++) {
                        int pos = (int) (Math.random() * todosCaracteres.length());
                        contrasena += todosCaracteres.charAt(pos);
                    }
                    System.out.println("Contraseña Generada: " + contrasena);
                    System.out.println("----------------------------------------");
                    break;

                case 4:
                    String[] usuarios = {"Harry", "Draco", "Sirius", "Hermione", "Ron", "Luna", "Dobby"}; // Lista de usuarios.
                    int[] intentosFallidos = {2, 3, 6, 4, 3, 1, 3}; // Intentos fallidos por usuario.
                    int Normal = 0, Sus = 0, Crit = 0; // Contadores de tipos de intentos.
                    double media = 0;
                    int Intentos = 0;

                    // Clasifica los usuarios según la cantidad de intentos fallidos.
                    for (int intento : intentosFallidos) {
                        if (intento <= 3) {
                            Normal++;
                        } else if (intento < 5) {
                            Sus++;
                        } else {
                            Crit++;
                        }
                        Intentos += intento;
                    }

                    String[] normales = new String[Normal];
                    String[] sospechoso = new String[Sus];
                    String[] critico = new String[Crit];

                    int contNormales = 0, contSosp = 0, contCrit = 0;
                    media = (double) Intentos / usuarios.length; // Calcula la media de intentos fallidos.
                    int porEncima = 0;

                    for (int i = 0; i < intentosFallidos.length; i++) {
                        String usu = usuarios[i];
                        int intento = intentosFallidos[i];
                        if (intento > media) {
                            porEncima++;
                        }
                        String cadena = usu + " - " + intento + " intentos";
                        if (intento <= 3) {
                            normales[contNormales] = cadena;
                            contNormales++;
                        } else if (intento < 5) {
                            sospechoso[contSosp] = cadena;
                            contSosp++;
                        } else {
                            critico[contCrit] = cadena;
                            contCrit++;
                        }
                    }
                    System.out.println("Se han realizado un total de " + Intentos + " intentos fallidos. La media es de " + media + " intentos fallidos por persona.\n" + porEncima + " usuarios están por encima de esa media");
                    System.out.println("Intentos normales:");
                    System.out.println("=====================");
                    System.out.println(Arrays.toString(normales));
                    System.out.println("Intentos sospechosos");
                    System.out.println("=====================");
                    System.out.println(Arrays.toString(sospechoso));
                    System.out.println("Intentos críticos");
                    System.out.println("=====================");
                    System.out.println(Arrays.toString(critico));
                    break;

                case 5:
                    System.out.println("Se ha salido del sistema de manera segura."); // Mensaje de salida segura.
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo."); // Mensaje para opción incorrecta.
                    break;
            }
        } while (opcion != 5);

        leer.close(); // Cierra el Scanner al finalizar el programa.
    }

    // Metodo para generar un carácter especial aleatorio.
    public static char generarCaracterEspecialAleatorio() {
        int[][] rangos = {
                {33, 47}, // Caracteres especiales en este rango ASCII.
                {58, 64},
                {91, 96},
                {123, 126}
        };

        Random random = new Random();
        int[] rangoSeleccionado = rangos[random.nextInt(rangos.length)]; // Selecciona un rango al azar.
        int codigo = rangoSeleccionado[0] + random.nextInt(rangoSeleccionado[1] - rangoSeleccionado[0] + 1); // Genera un código ASCII dentro del rango.
        return (char) codigo; // Retorna el carácter especial generado.
    }
}
