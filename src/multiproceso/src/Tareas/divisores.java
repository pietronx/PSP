package Tareas;
public class divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, cont=0;
		if(args.length==0) {
			System.out.println("No se han introducido valores");
		}
		else {
			x=Integer.parseInt(args[0]);
		
			for(int i=1;i<=x;i++) {
				if(x%i==0) {
					cont++;
				}
			}
			System.out.println("El numero de divisores de "+x+" es "+cont);
		}
	}
}