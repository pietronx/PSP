package S01_VariablesYConstantes;

public class Ejercicio_02 {
    public static void main(String[] args) {


        double m = 23;
        double n = 12;
        double resultado = 0;
        resultado = m+n;
        System.out.println(resultado);

        // Modificaciones

        //  modifica la variable resultado restándole 10
        resultado-=10;

        //  modifica la variable resultado multiplicándola por la variable m
        //  muestra por pantalla el valor actual de la variable resultado

        resultado*=m;
        System.out.println(resultado);

        //  modifica la variable resultado dividiéndola por la variable n
        //  muestra por pantalla el valor final de la variable resultado

        resultado/=n;
        System.out.println(resultado);

    }
}
