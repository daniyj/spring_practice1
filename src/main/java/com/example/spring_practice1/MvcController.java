package com.example.spring_practice1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("message","메시지 입력 내용");
        System.out.println(model);
        return "home";
    }
}
