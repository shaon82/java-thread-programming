public class Producer implements Runnable{

    Q q;

    Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {

        int i = 1;

        while (true){
            q.setData(i++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
