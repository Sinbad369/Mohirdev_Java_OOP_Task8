public class GoalKeeper extends FootballPlayer{
    private int countOfSaves;

    public GoalKeeper(int countOfGoals, int countOfRedCard, int countOfYellowCard, int countOfSaves) {
        super(countOfGoals, countOfRedCard, countOfYellowCard);
        this.countOfSaves = countOfSaves;
    }

    public int getCountOfSaves() {
        return countOfSaves;
    }

    @Override
    public void getInfo(){
        System.out.println("Team Name: " + teamName());
        System.out.println("Name Of Player: " + nameOfPlayer());
        System.out.println("Sport Type: " + sportType());
        System.out.println("Number Position: " + numberPosition());
        System.out.println("Number of Red Cards: " + getCountOfRedCard());
        System.out.println("Number of Yellow Cards: " + getCountOfYellowCard());
        System.out.println("Count of Goals: " + getCountOfGoals());
        System.out.println("Count of Saves: " + getCountOfSaves());
    }
}
