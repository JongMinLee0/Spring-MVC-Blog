package com.demo.app.service.impl;

import com.demo.app.model.Member;
import com.demo.app.repo.MemberRepository;
import com.demo.app.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public boolean signInMember(Member member) {

        return false;
    }

    public boolean signUpMember(Member member) {
        return false;
    }
}
