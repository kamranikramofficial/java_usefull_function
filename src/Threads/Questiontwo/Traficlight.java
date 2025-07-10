package Threads.Questiontwo;

public class Traficlight  extends Thread{

    private final light color;


    public Traficlight(light color) {
        this.color = color;
    }

    @Override
    public synchronized void run() {
        System.out.printf("%s This Color is Active %n" , color);
        try {
            Thread.sleep(color.getMilleSeconde());
        } catch (InterruptedException e) {
            System.out.printf("this is the ERROR %s" ,e.getMessage());
        }
        System.out.printf("%s This Color is unActive %n" , color);

    }

    public static void main(String[] args) throws InterruptedException {
        Traficlight red = new Traficlight(light.red);
        Traficlight yellow = new Traficlight(light.yellow);
        Traficlight green = new Traficlight(light.Green);


        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();

    }
}
