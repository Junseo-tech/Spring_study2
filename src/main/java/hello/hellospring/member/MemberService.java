package hello.hellospring.member;

import org.springframework.context.annotation.Bean;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
