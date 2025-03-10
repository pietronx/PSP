package ejemplos;

public class ejemplo5 {

    public static void imprimirPrimerElemento(String[] lista)
    {
        System.out.println(lista[2]);
    }

    public static void main (String[] args)
    {
        String[] animales = { "perro","gato","tigre"};
        imprimirPrimerElemento(animales);
    }
}

