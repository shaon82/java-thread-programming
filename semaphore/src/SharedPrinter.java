import java.util.concurrent.Semaphore;

public class SharedPrinter {

    private final Semaphore semaphore = new Semaphore(2);


    public void printJon(String name){
        System.out.println(name+" is waiting to access the printer");

        try {
            semaphore.acquire();
            System.out.println(name + " is printing");
            Thread.sleep(2000);
            System.out.println(name + " has finished printing");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();
            System.out.println(name + " has released the printer");
        }
    }
}
