import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparator<Member> {
    private int memberId; // 멤버 id
    private String memberName; // 멤버 이름


    public Member(){}
    // Getter와 Setter
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // ToString 재조정
    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int compare(Member m1, Member m2) {
        return (m1.memberId - m2.memberId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

//    @Override
//    public int compareTo(Member member) {
//        if (this.memberId > member.memberId) {
//            return -1;
//        } else if ( this.memberId < member.memberId) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
}
