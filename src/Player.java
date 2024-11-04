public abstract class Player implements Information{
    abstract String nameOfPlayer();
    abstract String sportType();
    abstract int numberPosition();
    abstract String teamName();

    public Player() {
    }

    @Override
    public void getInfo() {

    }

    @Override
    public void getTeamName() {
        System.out.println(teamName());
    }
}
