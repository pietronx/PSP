package S05_ArraysUnidimensionales;

/*
 * Define un array de 12 números enteros con el nombre nums y asigna los valores según la tabla que se muestra a continuación.
 * Luego muestra el contenido de todos los elementos del array.
 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 */
public class Ejercicio_01 {
    public static void main(String[] args) {

        // inicializar un array
        int[] nums;
        // darle un tamaño y llenarlo de valores
        nums = new int[12];
        // llenar de valores el array
        nums[0] = 39;
        nums[1] = -2;
        nums[4] = 0;
        nums[6] = 14;
        nums[8] = 5;
        nums[9] = 120;

        // bucle para imprimir todos los valores del array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
/*
* ¿Qué sucede con los valores de los elementos que no han sido inicializados?
* R: Los valores que no se inicializan se asigna el valor 0
*/