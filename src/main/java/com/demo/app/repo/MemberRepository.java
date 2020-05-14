package com.demo.app.repo;

import com.demo.app.model.Member;

public interface MemberRepository {

    int signInMember(Member member);

    int signUpMember(Member member);

}
