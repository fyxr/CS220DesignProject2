import java.util.Comparator;

public class AstSort implements Comparator<Meteor> {

    public int compare(Meteor a, Meteor b) {
        int sortTime = a.getTime().compareTo(b.getTime());
        int sortPopulation = a.getPopulation().compareTo(b.getPopulation());

        if (sortTime == 0)
            return sortPopulation;
        else
            return sortTime;
    }
}
