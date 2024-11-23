package TareasPorTeclado;
import java.io.*;
import java.util.Scanner;
public class lanzadorCapitales {

	public static void main(String[] args) {

	
		String pais="" , capital="";
		Scanner sc = new Scanner(System.in);
		Process proceso;
		try 
		{
			proceso = new ProcessBuilder(args).start();
			System.out.println("Introduce un pais: ");
			pais = sc.nextLine();
			
			InputStream is;
			InputStreamReader isr;
			BufferedReader br;
			OutputStream os;
			OutputStreamWriter osw;
			PrintWriter pw;
			
			os=proceso.getOutputStream();
			osw=new OutputStreamWriter(os);
			pw=new PrintWriter(osw);
			
			pw.println(pais);
	
			pw.close();
			osw.close();
			os.close();
			
			is=proceso.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			capital=br.readLine();
			
			while(capital!=null) {
				System.out.println("La capital de "+pais+" es "+capital+".");
				capital=br.readLine();
			}
			
			br.close();
			isr.close();
			is.close();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
