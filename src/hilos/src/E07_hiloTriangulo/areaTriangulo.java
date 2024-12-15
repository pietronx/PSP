package E07_hiloTriangulo;

/*
Crear un programa que lance 10 hilos de ejecución donde a cada hilo se le pasará la base y la
altura de un triángulo, y cada hilo ejecutará el cálculo del área de dicho triángulo informando de
qué base y qué altura recibió y cuál es el área resultado.
 */

public class areaTriangulo extends Thread {

    private int base, altura;

    // Constructor
    public areaTriangulo (int init_base, int init_altura){
        this.base = init_base;
        this.altura = init_altura;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int area = base * altura / 2;
            System.out.println("Base "+ i +": "+ base);
            System.out.println("Altura "+ i +": "+ altura);
            System.out.println("Area"+ i +": "+ area);
        }
    }
}