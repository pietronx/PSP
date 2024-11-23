package Repaso;
import java.util.ArrayList; // Importamos la clase ArrayList para crear listas dinámicas

public class ListaNombres 
{
	private String nombreDeLaLista; // Nombre de la lista de nombres, variable de instancia (fuera del main)
	private ArrayList<String> listadenombres; // Lista de arrays llamada listaDeNombres, contendrá los nombres
	
	// Constructor para inicializar el nombre de la lista y crear la lista vacía
	public ListaNombres(String nombre) 
	{
		super(); // Llamada opcional al constructor de la superclase
		nombreDeLaLista = nombre; // Asignamos el nombre de la lista
		listadenombres = new ArrayList<String>(); // Creamos una nueva lista vacía
	}
	
	// Getter para obtener el nombre de la lista
	public String getNombreDeLaLista() 
	{
		return nombreDeLaLista; // Devolvemos el nombre actual de la lista
	}

	// Setter para modificar el nombre de la lista
	public void setNombreDeLaLista(String nombreDeLaLista) 
	{
		this.nombreDeLaLista = nombreDeLaLista; // Asignamos un nuevo nombre a la lista
	}

	// Método para añadir un nombre a la lista de nombres
	public void addNombre(String nombre) 
	{	
		listadenombres.add(nombre); // Añadimos el nombre a la lista de nombres
		// Mensajes para confirmar la acción
		System.out.println("-----------------------------------------------");
		System.out.println("Nombre: " + nombre + " añadido correctamente ");
		System.out.println("-----------------------------------------------");
		System.out.println(""); // Línea vacía para separar visualmente
	}

	// Getter para obtener el nombre en una posición específica de la lista
	public String getNombre(int posicion) 
	{
		// Verificamos si la posición es válida antes de acceder al nombre
		if (posicion >= 0 && posicion < listadenombres.size()) 
		{
			return listadenombres.get(posicion); // Devolvemos el nombre en esa posición
		}
		else 
		{
			return "No existe nombre para la posicion solicitada"; // Mensaje si la posición es inválida
		}
	}

	// Getter para obtener el tamaño de la lista
	public int getTamano() 
	{
		return listadenombres.size(); // Devolvemos el tamaño actual de la lista
	}
	
	// Método para eliminar un nombre en una posición específica de la lista
	public void removeNombre(int posicion) 
	{
		// Verificamos si la posición es válida antes de intentar eliminar
		if (posicion >= 0 && posicion < listadenombres.size()) 
		{
			listadenombres.remove(posicion); // Eliminamos el nombre en esa posición
		} 
	}

	// Método principal (main), punto de entrada del programa
	public static void main(String[] args) 
	{	
		// Creamos una nueva instancia de ListaNombres llamada 'Agenda'
		ListaNombres lista = new ListaNombres("Agenda");
		
		// Añadimos nombres a la lista
		lista.addNombre("Juan");
		lista.addNombre("Antonio");
		lista.addNombre("Carmen");

		// Obtenemos nombres en posiciones específicas de la lista
		String a = lista.getNombre(0); // Primer nombre
		String b = lista.getNombre(2); // Tercer nombre
		String c = lista.getNombre(10); // Posición fuera del rango, retornará mensaje de error

		// Mostramos los nombres obtenidos en consola
		System.out.println(a +" -- "+ b +" -- "+ c);
		
		// Eliminamos el nombre en la posición 2 (Carmen)
		lista.removeNombre(2);
		
		// Obtenemos los nombres nuevamente tras eliminar un nombre
		String e = lista.getNombre(0); // Primer nombre sigue siendo el mismo
		String f = lista.getNombre(2); // Posición 2 ahora está vacía
		String g = lista.getNombre(10); // Posición fuera del rango, retornará mensaje de error
	
		// Mostramos los resultados tras la eliminación
		System.out.println(e +" -- "+ f +" -- "+ g);
	}
}
