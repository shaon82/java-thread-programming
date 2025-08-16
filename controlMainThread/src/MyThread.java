public class MyThread implements Runnable{

    Thread t;

    public MyThread() {
        t = new Thread(this,"MyThread");
        t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + t.getName() + " is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread " + t.getName() + " interrupted.");
            }
        }
    }
}
