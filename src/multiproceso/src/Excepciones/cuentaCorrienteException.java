package Excepciones;

public class cuentaCorrienteException {

	// Declaramos variables
	private double balance;
	double numero;
	
	// Constructor de la cuenta coriente
	public cuentaCorrienteException(double numero) 
	{
		this.numero = numero; 
	}
	
	// Método para depositar dinero
	public void deposito(double cantidad) 
	{
		balance += cantidad; //-> balance de la cuenta = cantidad de dinero depositado + balance de la cuenta
	}
	
	// Método para retirar dinero, el cual trae las excepciones declaradas en los fondos insuficientes*
	// *fondos insuficientes: Esto en caso de que quieras retirar una cantidad de dinero que no posees en la cuenta
	public void retiro (double cantidad) throws Excepciones.FondosInsuficientesException
	{
		/* 
		 * Si la cantidad retirado es menor o igual al de la cuenta, se resta esta cantida al balance total. 
		 * Por lo contrario, si es mayor, creamos una variable llamada resta, y le lanzamos (traemos de otra clase) la excepción de fondos insuficientes
		 */
		if(cantidad <= balance) 
		{	
			balance-=cantidad; // balance = balance-cantidad
		}
		else 
		{
			double resta = cantidad-balance;
			throw new Excepciones.FondosInsuficientesException(resta);
		}
	}
}
