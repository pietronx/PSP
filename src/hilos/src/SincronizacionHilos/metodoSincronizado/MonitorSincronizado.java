package SincronizacionHilos.metodoSincronizado;

import java.util.Date;

public class MonitorSincronizado {
	public static void main(String[] args) {
		//try {
			long ini = new Date().getTime();
			
			Contador contador = new Contador();
			
			Hilo hilo = new Hilo(contador);
			Hilo hilo2 = new Hilo(contador);
			
			hilo.start();
			hilo2.start();
			
			try {
				hilo.join();
				hilo2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			long fin = new Date().getTime();
			System.out.println("Tiempo total:" + (fin - ini));
		/*} catch (InterruptedException ex) {
			ex.printStackTrace();
		}*/
	}
}
