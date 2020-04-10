import java.util.NoSuchElementException;

public class Batman implements Runnable {
    public Batman() { }

    public void run(){
        Console c = new Console();
        c.enter(100);
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(c.destroy());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    //Do Nothing
                }
            }
        }catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
