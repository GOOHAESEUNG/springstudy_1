package hello.core.member;

public class MemberApp {

    //순수한 자바 코드
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(Grade.VIP, "memberA", 1L);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }
}
