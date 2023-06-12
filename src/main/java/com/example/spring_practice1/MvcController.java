package com.example.spring_practice1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

    //RequestMapping메소드는 Model model 이라는 인자를 가지고 있습니다.
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("message","메시지 입력 내용");
        System.out.println(model);
        return "home";
    }

    @RequestMapping("/student")
    public String student(Model model) {
        //html에서 Student객체 활용하도록 함
        model.addAttribute("object", new Student("yedi", "yedi@gmail.com"));
        return "student";
    }
}
