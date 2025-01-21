package com.example.study.hello_spring.controller;

import com.example.study.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired //생성자에 오토와이어가 있으면 서비스를 스프링 컨테이너에 있는 서비스를 가져다가 '연결'시켜줌
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
