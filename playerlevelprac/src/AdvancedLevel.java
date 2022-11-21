public class AdvancedLevel implements PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달리고 있네요. 숨 안차니..?");
    }

    @Override
    public void jump() {
        System.out.println("Jump! 했습니다. 성장을 좀 했나봅니다 ㅋ");
    }

    @Override
    public void turn() {
        System.out.println("아직도 직진하는 병이 있나봅니다. 뒤좀 봐라 이자식아");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 중급자 레벨입니다. ******");
    }
}
