public class CallMe {

    public void call(String sms){
        System.out.print("[ "+sms);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
