package com.demo.app.repo;

import com.demo.app.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:web/WEB-INF/applicationContext.xml")
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void memberSignInTest(){
        Member member = new Member("test", "test");
        int isExistMember = memberRepository.signInMember(member);
        assertEquals(1, isExistMember);
    }

    @Test
    public void memberSignUpTest(){
        Member member = new Member("test", "test");
        int isSuccess = memberRepository.signUpMember(member);
        assertEquals(1, isSuccess);
    }

}
