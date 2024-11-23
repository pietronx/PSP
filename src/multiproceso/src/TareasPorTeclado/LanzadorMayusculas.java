package TareasPorTeclado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class LanzadorMayusculas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			ProcessBuilder pb=new ProcessBuilder(args);
			Process proceso=pb.start();
			
			System.out.println("Introduce una frase en minusculas: ");
			String x =sc.nextLine();
			
			OutputStream os = proceso.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			PrintWriter pw = new PrintWriter(osw);
			pw.print(x);
			
			pw.close();
			osw.close();
			os.close();
			
			InputStream is = proceso.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linea=br.readLine();
			while (linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
			
			br.close();
			isr.close();
			is.close();
			
		} catch	(IOException e) {
			e.printStackTrace();
		}
			sc.close();
		}
	}
