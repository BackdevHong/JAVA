package game;

public class expert extends Game {

    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 Jump 합니다.");
    }

    @Override
    public void trun() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}
