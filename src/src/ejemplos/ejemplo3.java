package ejemplos;// Ejemplo lanzador de procesos
//Programa que abra la calculadora mediante la ruta del sistema (ProcessBuilder)

public class ejemplo3 {
	// TODO Auto-generated method stub
	public void ejecutar(String ruta) {
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String ruta = "C:\\Windows\\System32\\calc.exe";
		ejemplo3 lp = new ejemplo3();
		lp.ejecutar(ruta);
		System.out.println("Finalizado");
	}
}