package Excepciones;

public class FondosInsuficientesException extends Exception{


	private static final long serialVersionUID = 1L;
	private double cantidad;

	// Constructor de los Fondos
	public FondosInsuficientesException(double cantidad) {
		// Declaramos el this para darle un valor a "cantidad", que en este caso es la misma variable
		this.cantidad = cantidad;
	}
	
	//Getter de la cantidad
	public double getCantidad() {
		return cantidad;
	}
}
