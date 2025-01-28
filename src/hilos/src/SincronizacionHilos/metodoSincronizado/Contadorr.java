package SincronizacionHilos.metodoSincronizado;

public class Contadorr {
	private int contador = 0;


	/**
	 * Sincronizando el m�todo completo se resuelve el problema, pero se bloquean
	 * todos los m�todos sincronizados del objeto.
	 */
	synchronized public void agrega() {
		contador++;
	}
	
	synchronized public void resta() {
		contador--;
	}

	synchronized public int getContador() {
		return contador;
	}


}
