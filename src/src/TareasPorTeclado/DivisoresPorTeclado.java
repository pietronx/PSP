package TareasPorTeclado;

import java.util.Scanner;

public class DivisoresPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int cont=0; //cont: contador de divisores
		
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				cont++;
			}
		}
		System.out.println(num+" tiene "+cont+" divisores");
		sc.close();
	}
}
