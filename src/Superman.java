import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Superman {
    private Queue<Meteor> superman;

    public Superman() {
        superman = new PriorityBlockingQueue<>(100, new AstSort());
    }

    public Meteor next() {
        return superman.poll();
    }

    public void add(Meteor a) { superman.add(a); }

    public void countdown() {
        for (Meteor key : superman) key.changeHeight();
    }

    public Meteor peek() {
        return superman.peek();
    }

    public boolean isEmpty() {
        return superman.isEmpty();
    }

    public int size() {
        return superman.size();
    }
}
