package repasoElectrodomes;

public class compruebaElectrodomestico {
    public static void main(String[] args) {

        electrodomestico Horno = new electrodomestico("Horno", "Samsung", 333.43);

        System.out.println(Horno);
        System.out.println("El consumo ha sido de: " + Horno.getConsumo(15));
        System.out.println("El coste total de horas por kW es: "+ Horno.getCosteConsumo(4,15));

    }
}
