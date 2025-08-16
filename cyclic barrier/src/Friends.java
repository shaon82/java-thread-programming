import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Friends implements Runnable{

    private CyclicBarrier barrier;

    private String name;

    public Friends(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }



    @Override
    public void run() {
        System.out.println(name+ " is ready to go out.");

        try {
            barrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
