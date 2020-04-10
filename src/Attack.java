import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Attack {
    private Queue<Meteor> space;
    Random rar = new Random();

    public Attack() {
        space = new LinkedList<>();
    }

    public void generate(int amount) {
        for (int i = 0; i < amount; i++) {
            space.add(new Meteor(rar.nextInt(1000) + 100));
        }
    }

    public void add(int x) {
        space.add(new Meteor(rar.nextInt(x)));
    }

    public Meteor fire() {
        return space.poll();
    }

}
