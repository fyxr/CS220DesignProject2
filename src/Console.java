import java.util.NoSuchElementException;

public class Console {
    private Attack vandal;
    private Superman justice;
    private int destruction;
    private final int max = 10;
    public Console() {
        vandal = new Attack();
        justice = new Superman();
        destruction = 0;
    }

    public void enter(int num) {
        vandal.generate(num);
        for (int i = 0; i < num; i++)
            justice.add(vandal.fire());
    }

    public String destroy() throws NoSuchElementException {
        if (!justice.isEmpty()) {
            if (justice.peek().getTime() < 1) {
                while (justice.peek().getTime() < 1) {
                    System.out.print(justice.peek().hit());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        //Do Nothing
                    }
                    destruction++;
                    if (destruction == max)
                        throw new NoSuchElementException( "The world has been destroyed!");
                    justice.next();
                }
            }
            String a = justice.peek().destroyDescription();
            for (int i = 0; i < 1; i++)
                justice.next();
            justice.countdown();

            return a;
        }
        throw new NoSuchElementException("The world is saved!");
    }

    public void bossAttack(int y) {
        vandal.add(y);
        justice.add(vandal.fire());
    }

    public int danger() {
        return justice.size();
    }
}
