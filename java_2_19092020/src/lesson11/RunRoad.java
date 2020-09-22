package lesson11;

public class RunRoad implements Barrier {
    private int distance;
    public RunRoad(int distance) {
        this.distance = distance;
    }
    @Override
    public String bar(Team team) {
        int canRun = team.getDistance();
        if (canRun >= distance) {
            return team.getName() + " пробежал " + team.getDistance() + "м.";
        } else {
            return team.getName() + " недобежал " + team.getDistance() + "м.";
        }
    }


}
