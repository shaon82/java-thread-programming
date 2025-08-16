import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutorService {

    public static void main(String[] args){

        CountDownLatch latch1 = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);

        ExecutorService service = Executors.newFixedThreadPool(2);
        System.out.println("Starting threads...");

        service.execute(new MyThread(latch1, "Thread 1"));
        service.execute(new MyThread(latch2, "Thread 2"));
        service.execute(new MyThread(latch3, "Thread 3"));
        service.execute(new MyThread(latch4, "Thread 4"));

        try {
            latch1.await();
            latch2.await();
            latch3.await();
            latch4.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
        System.out.println("All threads have completed execution.");
    }
}
