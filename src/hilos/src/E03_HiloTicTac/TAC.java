package E03_HiloTicTac;

public class TAC extends Thread {

    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                System.out.println("TAC");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}