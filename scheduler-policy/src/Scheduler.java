public interface Scheduler {
    void sendCallToAgent();

    default void getNextCall() {
        System.out.println("다음 상담 전화를 순서대로 대기열에서 가져옵니다.");
    }
}
