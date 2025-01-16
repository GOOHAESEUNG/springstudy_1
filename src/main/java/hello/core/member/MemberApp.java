package hello.core.member;

import hello.core.AppConfig;

public class MemberApp {

    //순수한 자바 코드
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        //기존
        //MemberService memberService = new MemberServiceImpl();

        //AppConfig을 통해 멤버 서비스 구현체 생성자 주입
        MemberService memberService = appConfig.memberService();

        Member member = new Member(Grade.VIP, "memberA", 1L);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }
}
