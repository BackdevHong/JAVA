import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
    private TreeSet<Member> memberTreeSet;

    public MemberTreeSet() {
        memberTreeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        memberTreeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        // Iterator 선언
        Iterator<Member> ir = memberTreeSet.iterator();


        // ir.hasNext()가 false가 될 때까지 돈다.
        while (ir.hasNext()) {
            Member member = ir.next(); // 다음 요소를 member에 저장시키고

            if (member.getMemberId() == memberId) { // memberId가 맞는지 확인
                memberTreeSet.remove(member); // 삭제하고
                return true; // true 반환
            }
        }
        System.out.println("해당 멤버id를 가지고 있는 유저가 없습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : memberTreeSet) {
            System.out.println(member);
        }
    }
}