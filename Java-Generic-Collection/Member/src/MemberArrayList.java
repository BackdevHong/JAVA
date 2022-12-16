import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> members;

    public MemberArrayList() {
        members = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        members = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public boolean removeMember(int memberId) {
        // Iterator 선언
        Iterator<Member> ir = members.iterator();

        // ir.hasNext()가 false가 될 때까지 돈다.
        while(ir.hasNext()) {
            Member member = ir.next(); // 다음 요소를 member에 저장시키고

            if (member.getMemberId() == memberId) { // memberId가 맞는지 확인
                members.remove(member); // 삭제하고
                return true; // true 반환
            }
        }
        System.out.println("해당 멤버id를 가지고 있는 유저가 없습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
