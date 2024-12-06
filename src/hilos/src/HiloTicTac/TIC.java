package HiloTicTac;

public class TIC extends Thread {

    public void run() {

        try {
            while (true) {
                Thread.sleep(2000);
                System.out.println("TIC");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
