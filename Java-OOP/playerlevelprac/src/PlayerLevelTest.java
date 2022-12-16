public class PlayerLevelTest {
    public static void main(String[] args) {
        Player p = new Player();
        p.play(1);

        PlayerLevel level = new AdvancedLevel();
        p.upgradeLevel(level);
        p.play(2);

        level = new SuperLevel();
        p.upgradeLevel(level);
        p.play(3);
    }
}
