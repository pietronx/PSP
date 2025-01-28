package SincronizacionHilos.metodoSincronizado;

public class Hilo extends Thread {
	Contadorr contador;

	public Hilo(Contadorr _contador) {
		this.contador = _contador;
	}

	public void run() {
		for (int i = 0; i < 10000000; i++) {
			contador.agrega();
			//contador.resta();
			contador.getContador();
		}
		System.out.println(contador.getContador());
	}
}
