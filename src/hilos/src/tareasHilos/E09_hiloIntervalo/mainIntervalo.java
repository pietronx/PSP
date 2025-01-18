package E09_hiloIntervalo;
/*
Crear un programa que nos muestre los números de un intervalo, teniendo un retardo entre uno
y otro de 1’5 segundos
 */
public class mainIntervalo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando intervalo\n");

        // LLamas a la clase hilo que hemos creado
        intervalo inter = new intervalo(1,3);
        // LLamas a la clase Hilo que está creada por java
        Thread h = new Thread(inter);
        h.start();  // Enviar al planificador de hilos
        h.join();   // Para escribir después de que el hilo termine
        System.out.println("\nIntervalo finalizado");

    }
}
