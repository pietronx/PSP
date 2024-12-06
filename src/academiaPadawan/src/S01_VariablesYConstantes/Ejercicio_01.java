//  Calcular el salario en dolares de Anakin.
package S01_VariablesYConstantes;
public class Ejercicio_01 {
    public static void main(String[] args) {

        final double dolar = 1.137;
        final double salario_en_euros = 2150.84;
        String nombre ="Anakin";
        double salario_en_dolar;

        salario_en_dolar = salario_en_euros * dolar;

        System.out.println("El salario en dólares de "+nombre+"es de: "+salario_en_dolar);

    }
}