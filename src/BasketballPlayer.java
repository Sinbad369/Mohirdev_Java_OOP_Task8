public class BasketballPlayer extends Player {
    private int numberOfGoals;

    public BasketballPlayer(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    @Override
    String nameOfPlayer() {
        return "Bozorbek";
    }

    @Override
    int numberPosition() {
        return 34;
    }

    @Override
    String sportType() {
        return "Basketball";
    }

    @Override
    String teamName() {
        return "La Hermonidas";
    }
}
