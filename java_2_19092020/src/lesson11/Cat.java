package lesson11;


public class Cat implements Team{
    private String name;
    private int distance;
    private int height;


    public Cat(String name, int distance, int height) {
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
        return "Cat{" +
                "distance=" + distance +
                ", height=" + height +
                '}';
    }
}
