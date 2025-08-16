import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {

        CyclicBarrier barrier= new CyclicBarrier(3,()-> {
            System.out.println("All friends are ready, let's go out!");
        });

        new Thread(new Friends(barrier, "friend 1")).start();
        new Thread(new Friends(barrier, "friend 2")).start();
        new Thread(new Friends(barrier, "friend 3")).start();
    }
}