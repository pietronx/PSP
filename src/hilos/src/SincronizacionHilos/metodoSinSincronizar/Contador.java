package SincronizacionHilos.metodoSinSincronizar;

public class Contador {
	private int contador = 0;

	 //Sin monitor, tenemos errores de concurrencia
	 public void agrega(){
	 contador++;
	 }
	 public int getContador() {
		return contador;
	}
	/**
	 * Sincronizando el m�todo completo se resuelve el problema, pero se bloquean
	 * todos los m�todos sincronizados del objeto.
	 */
//	synchronized public void agrega() {
//		contador++;
//	}
//
//	synchronized public int getContador() {
//		return contador;
//	}

}
