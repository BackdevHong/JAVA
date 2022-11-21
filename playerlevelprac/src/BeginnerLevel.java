public class BeginnerLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("달릴 수 없어 천천히 걷습니다. 참 여유롭군요.");
    }

    @Override
    public void jump() {
        System.out.println("Jump를 하려고 했으나 아직 미흡했습니다..");
    }

    @Override
    public void turn() {
        System.out.println("앞으로만 가는 병이 생긴것 같습니다.. 흐음.. 왜이럴까요?");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 초급자 레벨입니다. ******");
    }
}
