import java.util.Random;

public class Meteor {
    private int gravity = 10;
    private int height = 100000;
    private int weight;
    private int speed;
    private int population;
    Random rando = new Random();

    public Meteor(int weight) {
        this.weight = weight;
        speed = this.weight * gravity;
        population = rando.nextInt(100000) + 10000;
    }

    public Integer getTime() {
        return height/speed;
    }

    public Integer getPopulation() {
        return population;
    }

    public Integer getHeight() {
        return height;
    }

    public void changeHeight() {
        height = height - speed;
    }

    public String destroyDescription() {
        return "Superman you have to destroy this meteor that will hit a city of " + population + " people " +
                "in " + this.getTime() + " minutes!\n";
    }

    public String hit() {
        return "A meteor has hit a city of " + population + " people!\n";
    }
}
