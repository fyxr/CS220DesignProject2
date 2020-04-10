import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Attack {
    private Queue<Meteor> space;
    Random rar = new Random();

    public Attack() {
        space = new LinkedList<>();
    }

    public void generate(int amount) {//generates large amounts of Meteors with random weight
        for (int i = 0; i < amount; i++) {
            space.add(new Meteor(rar.nextInt(1000) + 100));//Might want to balance this
        }
    }

    public void add(int x) {
        space.add(new Meteor(rar.nextInt(x)));
    }//generates one meteor

    public Meteor fire() {
        return space.poll();
    }//removes from head of queue

}
