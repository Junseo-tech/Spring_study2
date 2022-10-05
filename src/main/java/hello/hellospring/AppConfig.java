package hello.hellospring;

import hello.hellospring.discount.DiscountPolicy;
import hello.hellospring.discount.FixDiscountPolicy;
import hello.hellospring.discount.RateDiscountPolicy;
import hello.hellospring.member.Member;
import hello.hellospring.member.MemberService;
import hello.hellospring.member.MemberServiceImpl;
import hello.hellospring.member.MemoryMemberRepository;
import hello.hellospring.order.Order;
import hello.hellospring.order.OrderService;
import hello.hellospring.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //애플리케이션의 설정정보 라는 뜻
public class AppConfig { //애플리케이션에 대한 환경 구성 다 함

    @Bean //스프링 컨테이너에 등록
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }


    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }


    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),
                 discountPolicy());
    }


    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}

