/*
Crea dos nuevos hilos llamados HiloTic e HiloTac. El primero debe visualizar en pantalla un bucle
infinito con la palabra “TIC”, y el segundo con la palabra “TAC”. Crea la clase HiloReloj, que en
su metodo main cree e inicie los hilos anteriores.
Introduce después de la sentencia de escritura de cada hilo un retardo de 1 segundo. Utiliza el
metodo sleep(long mils), donde se indica el tiempo en milisegundos. Este metodo arroja
excepciones InterruptedException, por lo que debes añadir un bloque try-cath para capturarla.
*/

package E03_HiloTicTac;

public class TicTacMain {
    public static void main(String[] args) {
        TIC tic = new TIC();
        TAC tac = new TAC();

        tic.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tac.start();
    }
}
