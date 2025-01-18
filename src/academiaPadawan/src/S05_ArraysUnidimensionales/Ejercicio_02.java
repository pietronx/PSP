package S05_ArraysUnidimensionales;

/*
Define un array de 10 caracteres con el nombre simbolos y asigna valores a los elementos según la tabla que se muestra a continuación.
Muestra el contenido de todos los elementos del array.
¿Qué sucede con los valores de los elementos que no han sido inicializados?
 */
public class Ejercicio_02 {

    public static void main(String[] args) {

        Character[] simbolos = new Character[10];

        simbolos[0] = 'a';
        simbolos[1] = 'x';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';

        for (int i = 0; i < simbolos.length; i++) {
            System.out.print(simbolos[i] + " ");
        }

    }
}
/*
 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * R: Los valores pasan a ser null
 */
