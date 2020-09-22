package lesson11;

public class Main {

    public static void main(String[] args) {
        Team[] team = {new Human("Kolya",35,1), new Cat("Barsik",4,3), new Robot("Elektronik", 100,20)};
        Barrier[] barriers = {new RunRoad(20), new Wall(5)};
        for (int i = 0; i < team.length; i++){
            for(int j = 0; j < barriers.length; j++){
                if(barriers[j].bar(team[i]).contains("недо")) {
                    System.out.println(barriers[j].bar(team[i]));
                    break;
                } else {
                    System.out.println(barriers[j].bar(team[i]));
                }
            }
        }
    }
}
