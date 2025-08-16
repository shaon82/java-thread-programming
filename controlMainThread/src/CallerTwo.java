public class CallerTwo implements Runnable{

    String sms;

    CallMe callMe;

    Thread thread;

    CallerTwo(CallMe callMe, String sms) {
        this.callMe = callMe;
        this.sms = sms;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (callMe){

            callMe.call(sms);
        }

    }
}
