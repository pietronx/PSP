package TareasPorTeclado;
import java.io.*;
import java.util.Scanner;
 class LanzadorMayusculasBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				try {
					ProcessBuilder pb=new ProcessBuilder(args);
					Process proceso=pb.start();
										
					/* do {
					
						minus=sc.nextLine();
						
						if (!minus.equals(".")){
						
							mayus= minus.toUpperCase(); // Convertir la frase en mayúsculas
							System.out.println(mayus);
					
						}
					} while (!minus.equals("."));
					
						System.out.println("Programa finalizado"); */
				
					OutputStream os = proceso.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					
					PrintWriter pw = new PrintWriter(osw);

					String minus="";

					while (!minus.equals(".")) {
						
						pw.print(minus);
						System.out.println("Introduce una cadena: ");
						minus=sc.nextLine();
					}
					
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
