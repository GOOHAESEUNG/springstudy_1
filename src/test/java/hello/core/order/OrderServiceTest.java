package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(  Grade.VIP,"memberA",memberId);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "ItemA", 10000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
