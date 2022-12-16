public class SuperLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("슈퍼맨에 빙의해서 지구를 3바퀴를 돌고 왔네요. 장하다 내새끼!");
    }

    @Override
    public void jump() {
        System.out.println("Jump! 했습니다. 서울타워까지 점프하는거 보니 잘 먹었나봅니다.");
    }

    @Override
    public void turn() {
        System.out.println("드디어 뒤를 보네요.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 고급자 레벨입니다. ******");
    }
}
