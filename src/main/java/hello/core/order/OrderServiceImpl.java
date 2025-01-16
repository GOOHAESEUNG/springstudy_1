package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
//////    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
////    //OCP 위반 - 클라이언트 코드 수정 , DIP 위반 - 구현체에 의존
////    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
//
//    //구현체에 의존하지 않고 인터페이스에만 의존하게 됨 - DIP 지키게 됨
//    private DiscountPolicy discountPolicy;


    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
