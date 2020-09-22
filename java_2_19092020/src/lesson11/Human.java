package lesson11;


public class Human implements Team {
    private int distance;
    private int height;
    private String name;

    public Human(String name, int distance, int height) {
        this.distance = distance;
        this.height = height;
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "distance=" + distance +
                ", height=" + height +
                '}';
    }
}
