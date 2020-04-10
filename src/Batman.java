import java.util.NoSuchElementException;

public class Batman implements Runnable {
    public Batman() { }

    public void run(){//Hosts the thread and the methods to be used
        Console c = new Console();
        c.enter(100);
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(c.destroy());
                try {
                    Thread.sleep(500);//change for specific time intervals
                } catch (InterruptedException e) {
                    //Do Nothing
                }
            }
        }catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
