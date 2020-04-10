import java.util.Random;

public class Meteor {
    private int gravity;//Might want to balance some of these values for specific effects
    private int height = 100000;
    private int speed;
    private int population;
    Random rando = new Random();

    public Meteor(int weight) {
        gravity = 10;//Because I don't want to deal with doubles
        speed = weight * gravity;
        population = rando.nextInt(100000) + 10000;// randomizes city population being hit
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

    public String destroyDescription() {//Description of the next meteor to destroy
        return "Superman you have to destroy this meteor that will hit a city of " + population + " people " +
                "in " + this.getTime() + " minutes!\n";
    }

    public String hit() {//Message of the city being hit by meteor
        return "A meteor has hit a city of " + population + " people!\n";
    }
}
