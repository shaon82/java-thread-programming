public class NewThread extends Thread{

    public NewThread(){
        super("new thread");
        System.out.println("New thread created: " + this.getName());
    }


    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println("New thread is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("New thread interrupted.");
            }
        }
    }
}
