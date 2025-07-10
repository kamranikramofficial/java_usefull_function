package Threads.QuestionOne;

public class CheakThread  extends Thread{

    char character ;

    public CheakThread(char character) {
        this.character = character;
    }

    @Override
    public synchronized void run(){

        for (int i=0 ;i <= 10 ; i++ ){
            System.out.printf("This is in this thread %c" ,character);
        }

    }

    public static void main(String[] args) throws InterruptedException{
        CheakThread th = new CheakThread('%');
        CheakThread th3 = new CheakThread('&');
//        System.out.println("\n"+th.getState() +"\n");

        th.start();

//        System.out.println("\n"+th.getState() +"\n");
//            th.sleep(10000);
//            th.wait(10000);
//        th.join(66);
        th3.start();

//        System.out.println("\n"+th.getState() +"\n");


    }

}

