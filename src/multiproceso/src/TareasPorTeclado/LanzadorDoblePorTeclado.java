package TareasPorTeclado;
import java.util.*;
import java.io.*;
public class LanzadorDoblePorTeclado {
	public static void main (String[] args) {
		
		Process proceso;
		Scanner sc = new Scanner(System.in);
		try {
		proceso = new  ProcessBuilder(args).start();
		System.out.println("Introduce un Número: ");
		int x=sc.nextInt();
		
		OutputStream os = proceso.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		
		pw.print(x);
		
		pw.close();
		osw.close();
		os.close();
		
		InputStream is=proceso.getInputStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		
		String linea=br.readLine();
		while (linea!=null) {
			System.out.println(linea);
			linea=br.readLine();
		}
		
		br.close();
		isr.close();
		is.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			sc.close();
		}
	}
}
