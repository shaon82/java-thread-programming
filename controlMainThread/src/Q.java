public class Q {

    int data ;

    boolean hasData = false;

    public synchronized int getData(){

        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Data is : " + data);
        hasData = false;
        notify();
        return data;
    }


    public synchronized  void setData(int value){
        while (hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        data = value;

        System.out.println("Setting data "+data);
        hasData = true;
        notify();
    }
}
