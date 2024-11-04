public class VolleyballPlayer extends Player{
    private int numberOfPoints;

    public VolleyballPlayer(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    String nameOfPlayer() {
        return "Serikpay";
    }

    @Override
    int numberPosition() {
        return 22;
    }

    @Override
    String sportType() {
        return "Volleyball";
    }

    @Override
    String teamName() {
        return "House Rubins";
    }
}
