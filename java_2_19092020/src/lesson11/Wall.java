package lesson11;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String bar(Team team){
        int canJump = team.getHeight();
        if (canJump >= height) {
            return team.getName() + " перепрыгнул " + team.getHeight() + "м.";
        } else {
            return team.getName() + " недопрыгнул " + team.getHeight() + "м.";
        }
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }
}
