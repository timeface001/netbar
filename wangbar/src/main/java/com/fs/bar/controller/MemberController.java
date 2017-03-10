package com.fs.bar.controller;

import com.fs.bar.entity.Member;
import com.fs.bar.service.MemberService;
import com.fs.config.response.BaseResponse;
import com.fs.config.response.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by fengsong on 2017/3/9.
 */
@Controller
@RequestMapping("member")
public class MemberController {

    @Resource
    private MemberService memberService;


    @RequestMapping("/save")
    public BaseResponse save(@Valid Member member){

        memberService.save(member);
        return ResponseUtil.successful();
    }

}
