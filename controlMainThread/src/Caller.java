public class Caller implements Runnable{


    String sms;

    CallMe callMe;

    Thread thread;


    public Caller(CallMe callMe, String sms){
        this.callMe = callMe;
        this.sms = sms;
        thread = new Thread(this);
    }


    @Override
    public void run() {

        callMe.call(sms);

    }
}
