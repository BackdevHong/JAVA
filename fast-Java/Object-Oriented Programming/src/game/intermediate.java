package game;

public class intermediate extends Game {

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump 합니다.");
    }

    @Override
    public void trun() {
        System.out.println("턴이요? 그거 먹는건가요?");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다. *****");
    }
}
