package repasoInterfaces;

public class mainReales {
    public static void main(String[] args) {
        arrayReales a1 = new arrayReales(10);
        a1.imprimir();
        System.out.println();
        System.out.println("Minimo: " + a1.minimo());
        System.out.println("Maximo: " + a1.maximo());
        System.out.println("Sumatorio: " + a1.sumatorio());
    }
}