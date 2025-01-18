package E09_hiloIntervalo;

/*
Crear un programa que nos muestre los números de un intervalo, teniendo un retardo entre uno
y otro de 1’5 segundos
 */

public class intervalo implements Runnable {

    int inicio;
    int fin;

    // Constructor
    public intervalo(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
            try {
                Thread.sleep((1500));
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
    }
}

