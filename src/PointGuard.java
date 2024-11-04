public class PointGuard extends BasketballPlayer{
    private int countOfGuard;

    public PointGuard(int numberOfGoals, int countOfGuard) {
        super(numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }

    @Override
    public void getInfo(){
        System.out.println("Team Name: " + teamName());
        System.out.println("Name Of Player: " + nameOfPlayer());
        System.out.println("Sport Type: " + sportType());
        System.out.println("Number Position: " + numberPosition());
        System.out.println("Number of Guard: " + getCountOfGuard());
    }
}
