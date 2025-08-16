import java.util.concurrent.CountDownLatch;

public class LatchExample {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);

        new Thread(()->{
            System.out.println("Thread 1 done");
            latch.countDown();
        }).start();



        new Thread(()->{
            System.out.println("Thread 2 done");
            latch.countDown();
        }).start();


        new Thread(()->{
            System.out.println("Thread 3 done");
            latch.countDown();
        }).start();

        latch.await();

        System.out.println("All threads are done, proceeding with main thread execution.");
    }
}
