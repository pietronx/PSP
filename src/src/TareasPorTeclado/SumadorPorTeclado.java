package TareasPorTeclado;
import java.util.Scanner;
public class SumadorPorTeclado {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if (num2<num1) {
			int reserva = num1;
			num1 = num2;
			num2 = reserva;
		}
		int sumaTotal = 0;
			for (int i = num1; i <= num2; i++) {
				sumaTotal += i;

		}
		System.out.println("La suma total es: " + sumaTotal);
		sc.close();
	}
}