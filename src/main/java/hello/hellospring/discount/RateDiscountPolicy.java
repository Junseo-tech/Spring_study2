package hello.hellospring.discount;

import hello.hellospring.member.Grade;
import hello.hellospring.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private int discoutPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return  price * discoutPercent / 100;

        }else{
            return 0;

        }
    }
}
