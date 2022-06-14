package game;

public class Beginner extends Game {

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프요? 그거 먹는건가요?");
    }

    @Override
    public void trun() {
        System.out.println("턴이요? 그거 먹는건가요?");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초보자 레벨입니다. *****");
    }
}
