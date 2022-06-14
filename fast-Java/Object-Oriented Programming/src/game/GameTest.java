package game;

public class GameTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        intermediate alevel = new intermediate();
        player.upgradeLevel(alevel);
        player.play(2);

        expert blevel = new expert();
        player.upgradeLevel(blevel);
        player.play(3);

    }
}
