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

    public void enter(int num) {//Causes the asteroids to be generated and thrown at the earth
        vandal.generate(num);
        for (int i = 0; i < num; i++)
            justice.add(vandal.fire());
    }

    public String destroy() throws NoSuchElementException {
        if (!justice.isEmpty()) {//checks if there are threats else the world is saved
            if (justice.peek().getTime() < 1) {//checks if any asteroids have already hit
                while (justice.peek().getTime() < 1) {
                    System.out.print(justice.peek().hit());//prints hit message
                    try {
                        Thread.sleep(500);//change to slow or speed the thread
                    } catch (InterruptedException e) {
                        //Continue with the code
                    }
                    destruction++;
                    if (destruction == max)//maximum destruction level before complete destruction
                        throw new NoSuchElementException( "The world has been destroyed!");
                    justice.next();//removes the asteroid that has already hit then loops to check others in the queue
                }
            }
            String a = justice.peek().destroyDescription();
            for (int i = 0; i < 1; i++)//Change to determine how many asteroids superman destroys
                justice.next();
            justice.countdown();

            return a;
        }
        throw new NoSuchElementException("The world is saved!");
    }

    public void bossAttack(int y) {//In case you want to really f stuff up
        vandal.add(y);
        justice.add(vandal.fire());
    }

    public int danger() {
        return justice.size();
    }//Useful for checking the insides of the queue for balancing
}
