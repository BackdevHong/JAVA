public class MemberTreeSetTest {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();
        Member member4 = new Member();
        Member member5 = new Member();

        member1.setMemberId(1);
        member1.setMemberName("아스나");
        member2.setMemberId(2);
        member2.setMemberName("키리토");
        member3.setMemberId(3);
        member3.setMemberName("홍인성");
        member4.setMemberId(4);
        member4.setMemberName("유지오");
        member5.setMemberId(1);
        member5.setMemberName("홍길동");

        MemberTreeSet hashList = new MemberTreeSet();

        hashList.addMember(member1);
        hashList.addMember(member2);
        hashList.addMember(member3);
        hashList.addMember(member4);
        hashList.addMember(member5);

        System.out.println();
        hashList.showAllMember();
    }
}
