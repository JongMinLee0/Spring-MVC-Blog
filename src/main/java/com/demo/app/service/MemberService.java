package com.demo.app.service;

import com.demo.app.model.Member;

public interface MemberService {

    boolean signInMember(Member member);

    boolean signUpMember(Member member);

}
