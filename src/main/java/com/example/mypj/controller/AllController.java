package com.example.mypj.controller;

import com.example.mypj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllController {

    @GetMapping("/")
    public String homeRouter(){
        return "home";
    }

    @GetMapping("/signin")
    public String loginRouter(){
        return "signin";
    }

    @GetMapping("/board")
    public String boardRouter(){
        return "board";
    }

}
