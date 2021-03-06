package com.example.mypj;

import com.example.mypj.repository.MemberRepository;
import com.example.mypj.repository.MemoryMemberRepository;
import com.example.mypj.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}