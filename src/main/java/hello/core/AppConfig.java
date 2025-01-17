package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.*;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    //이 함수 호출 - 멤버 서비스 구현체 생성자 호출
    //생성자 주입
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
        //comm + option + m 리펙토링
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    //생성자 주입
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
