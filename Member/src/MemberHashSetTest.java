public class MemberHashSetTest {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();

        member1.setMemberId(1);
        member1.setMemberName("멤버이름");

        member2.setMemberId(1);
        member2.setMemberName("멤버요 ㅋ");

        MemberHashSet hashList = new MemberHashSet();

        hashList.addMember(member1);
        hashList.addMember(member2);

        System.out.println();
        hashList.showAllMember();
    }
}
