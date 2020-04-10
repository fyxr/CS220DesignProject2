import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Superman {
    private Queue<Meteor> superman;

    public Superman() {
        superman = new PriorityBlockingQueue<>(100, new AstSort());
    }

    public Meteor next() {
        return superman.poll();
    }//Destroys the meteor at the head of the queue

    public void add(Meteor a) { superman.add(a); }//adds a meteor to be sorted

    public void countdown() {
        for (Meteor key : superman) key.changeHeight();
    }//changes the heights of all meteors to be reduced by their speed

    public Meteor peek() {
        return superman.peek();
    }//checks the meteor at the head

    public boolean isEmpty() {
        return superman.isEmpty();
    }//checks if the queue is empty

    public int size() {
        return superman.size();
    }//checks the size of the queue
}
