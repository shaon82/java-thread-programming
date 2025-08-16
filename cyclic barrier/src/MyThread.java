import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{

    private CountDownLatch countDownLatch;

    public String name;

    public MyThread(CountDownLatch countDownLatch, String name) {
        this.countDownLatch = countDownLatch;
        this.name = name;
    }
    @Override
    public void run() {

        for (int i =0; i<5; i++){
            System.out.println(name + " is running " + i);
            countDownLatch.countDown();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
