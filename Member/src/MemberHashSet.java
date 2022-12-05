import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> memberHashSet;

    public MemberHashSet() {
        memberHashSet = new HashSet<>();
    }

    public MemberHashSet(int size) {
        memberHashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {
        memberHashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        // Iterator 선언
        Iterator<Member> ir = memberHashSet.iterator();

        // ir.hasNext()가 false가 될 때까지 돈다.
        while(ir.hasNext()) {
            Member member = ir.next(); // 다음 요소를 member에 저장시키고

            if (member.getMemberId() == memberId) { // memberId가 맞는지 확인
                memberHashSet.remove(member); // 삭제하고
                return true; // true 반환
            }
        }
        System.out.println("해당 멤버id를 가지고 있는 유저가 없습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : memberHashSet) {
            System.out.println(member);
        }
    }
}
