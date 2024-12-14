package hiloTriangulo;
/*
Crear un programa que lance 10 hilos de ejecución donde a cada hilo se le pasará la base y la
altura de un triángulo, y cada hilo ejecutará el cálculo del área de dicho triángulo informando de
qué base y qué altura recibió y cuál es el area resultado
 */
public class areaTriangulo extends Thread{

    int base, altura;

    int area = base * altura / 2;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){

        }
    }
}
