package Zd1;
// рахує час в секундах від запуску програми через MainRun
public class CounterThread extends Thread {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(1000);
                long elapsedTime = System.currentTimeMillis() - startTime;
                System.out.println(elapsedTime / 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}