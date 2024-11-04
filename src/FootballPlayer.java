public abstract class FootballPlayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(int countOfGoals, int countOfRedCard, int countOfYellowCard) {
        this.countOfGoals = countOfGoals;
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    @Override
    String nameOfPlayer() {
        return "Casillas";
    }

    @Override
    int numberPosition() {
        return 1;
    }

    @Override
    String sportType() {
        return "Football";
    }

    @Override
    String teamName() {
        return "Barselona";
    }
}
