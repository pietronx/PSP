package TareasPorTeclado;
import java.io.*;
import java.util.*;
public class LanzadorNumMasAlto 
{
	public static void main (String[] args) 
	{
		// Declaramos Variable
		int n;		

		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		
		// Iniciamos try-catch para capturar errores
		try 
		{
			// Iniciamos los Argumentos
			ProcessBuilder pb = new ProcessBuilder(args);
			Process proceso = pb.start();
			
			// Le pasa los datos al hijo
			OutputStream os = proceso.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			 // Pedimos datos al usuario desde el padre
            System.out.println("Introduce los numeros (0 para finalizar): ");
            n = sc.nextInt();

            // Iniciamos bucle para la recoleccion de numeros
            while(n != 0) 
            {
                pw.println(n);		// Enviamos el dato al hijo
                n = sc.nextInt();	// Leemos el dato introducido 
            }
            
            pw.println("0"); // Enviamos el 0 para detener el hijo, tambien podemos enviar el propio "n" como un 0. pw.println(n)            
            
			pw.close();
			osw.close();
			os.close();
			
			// Trae los datos del hijo
			InputStream is = proceso.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// Metodo para que el hijo lea los datos introducidos por el Padre "linea por linea"
			String linea;
			while ((linea=br.readLine())!=null)
			{
				System.out.println(linea);
			}
			
			br.close();
			isr.close();
			is.close();
		} 
		// Capturamos excepciones con el catch
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		sc.close();
	}
}
