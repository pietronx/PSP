package TareasPorTeclado;
import java.util.*;
import java.io.*;
public class LanzadorSumadorPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process proceso;
		Scanner sc = new Scanner(System.in);
		
		try {
			proceso = new  ProcessBuilder(args).start();
			System.out.print("Introduce dos Números: ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			//iniciamos el output
			OutputStream os = proceso.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println(x);
			pw.println(y);
			
			pw.close();
			osw.close();
			os.close();
			
			//iniciamos el input
			InputStream is=proceso.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			String linea=br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
			br.close();
			isr.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}