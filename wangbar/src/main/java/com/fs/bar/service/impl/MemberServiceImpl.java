package com.fs.bar.service.impl;

import com.fs.bar.dao.MemberMapper;
import com.fs.bar.entity.Member;
import com.fs.bar.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengsong on 2017/3/9.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public int save(Member member) {
        return memberMapper.save(member);
    }
}
