package TareasPorTeclado;
import java.io.*;
import java.util.Scanner;

public class LanzadorMedia {
	
	public static void main(String[] args) {
		
		// Iniciamos Scanner
		Scanner sc=new Scanner(System.in);
		
		// Iniciamos los Argumentos
		ProcessBuilder pb=new ProcessBuilder(args); // .start()
		try {
			Process proceso=pb.start();
			
			// Iniciamos las variables
			OutputStream os;
			OutputStreamWriter osw;
			PrintWriter pw;
			
			InputStream is;
			InputStreamReader isr;
			BufferedReader br;
			
			String linea;
			int n;
			
			// Le pasa los datos al hijo
			os=proceso.getOutputStream();
			osw=new OutputStreamWriter(os);
			pw=new PrintWriter(osw);
			
			// Con esto le metemos los datos al hijo para que se almacene en el array hijo 
			n=sc.nextInt();
			while(n!=0) {
				n=sc.nextInt();
				pw.println(n);
			}
			
			// Con esto hacemos que cuando el usuario meta 0, *desde el hijo* se detenga el programa. 
			pw.println("0"); 
			
			// Cerramos al revés de como lo abrimos para evitar errores.
			pw.close();
			osw.close();
			os.close();
			
			// Trae los datos del hijo
			is=proceso.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			// Metodo para que el hijo lea los datos introducidos por el Padre 
			while((linea=br.readLine())!=null) {
				System.out.println("Media: "+ linea);
			}
			
			// Cerramos al revés de como lo abrimos para evitar errores.
			br.close();
			isr.close();
			is.close();
			
		// Capturamos excepciones
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}