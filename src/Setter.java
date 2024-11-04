public class Setter extends VolleyballPlayer{
    private int countOfSets;

    public Setter(int numberOfPoints, int countOfSets) {
        super(numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public int getCountOfSets() {
        return countOfSets;
    }

    @Override
    public void getInfo(){
        System.out.println("Team Name: " + teamName());
        System.out.println("Name Of Player: " + nameOfPlayer());
        System.out.println("Sport Type: " + sportType());
        System.out.println("Number Position: " + numberPosition());
        System.out.println("Count of Sets: " + getCountOfSets());
    }
}
