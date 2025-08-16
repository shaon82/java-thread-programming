public class Consumer implements Runnable{

    Q q;

    Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
     while (true){
         q.getData();

         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
    }
}
