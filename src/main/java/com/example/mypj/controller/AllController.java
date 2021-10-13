package com.example.mypj.controller;

import com.example.mypj.domain.Member;
import com.example.mypj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AllController {

    private final MemberService memberService;

    @Autowired
    public AllController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String homeRouter(){
        return "home";
    }

    @GetMapping("/signin")
    public String signInRouter(){
        return "signin";
    }

    @PostMapping(value = "/signin")
    public String joinUser(MemberForm memberForm){
        String userName = memberForm.getName();
        Member newMember = new Member();
        newMember.setName(userName);
        memberService.join(newMember);
//        System.out.println(memberService.);
        return "redirect:/";
    }

    @GetMapping("/board")
    public String boardRouter(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "board";
    }

}
