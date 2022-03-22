package game;

public class Player {
    private Game level;

    public Player(){
        level = new Beginner();
        level.showLevelMessage();
    }

    public Game getLevel() {
        return level;
    }

    public void setLevel(Game level) {
        this.level = level;
    }

    public void upgradeLevel( Game level ) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }
}
