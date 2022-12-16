public class MemberArrayListTest {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();

        member1.setMemberId(1);
        member1.setMemberName("홍길동");

        member2.setMemberId(2);
        member2.setMemberName("홍상두");

        MemberArrayList list = new MemberArrayList();
        list.addMember(member1);
        list.addMember(member2);

        list.showAllMember();

        list.removeMember(2);

        System.out.println();
        list.showAllMember();
    }
}
