package com.demo.app.repo.impl;

import com.demo.app.model.Member;
import com.demo.app.repo.MemberRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    @Autowired
    private SqlSession sqlSession;

    public int signInMember(Member member) {
        return sqlSession.selectOne("mem.signInMember", member);
    }

    public int signUpMember(Member member) {
        return sqlSession.insert("mem.signUpMember", member);
    }
}
