
public class Main {
    public static void main(String[] args) {


        SharedPrinter sharedPrinter = new SharedPrinter();

        for (int i =1; i <=5; i++){
            String name = "user-"+i;
            new Thread(()-> sharedPrinter.printJon(name)).start();
        }



    }
}