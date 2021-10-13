package com.example.mypj;

import com.example.mypj.domain.Member;
import com.example.mypj.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
//        given
        String userName = "yunsuu";
        Member member = new Member();
        member.setName(userName);

//        when
        repository.save(member);

//        then
        Optional<Member> result = repository.findByName(userName);
        assertThat
    }
}
