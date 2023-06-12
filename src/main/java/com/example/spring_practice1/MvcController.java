package com.example.spring_practice1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        model.addAttribute("object2", new Student("bibi", "bibi@gmail.com"));
        return "student";
    }

    @RequestMapping("/is-logged-in")
    public String isLoggedIn(Model model) {
//        model.addAttribute("isLoggedIn", true);
        model.addAttribute("isLoggedIn", false);
        return "if-unless";
    }

    @RequestMapping("/each")
    public String items(Model model) {
        List<String> listOfStrings = Arrays.asList("foo", "bar", "baz");
        model.addAttribute("itemList", listOfStrings);
        return "each";
    }
    @RequestMapping("/students")
    public String students(Model model) {
        List<Student> studentList = Arrays.asList(
                new Student("Alex","Alex@gmail.com"),
                new Student("Brad","Brad@gmail.com"),
                new Student("Chad","Chad@gmail.com")
        );
        model.addAttribute("studentList", studentList);
        return "students";
    }
    private int hitCount = 0;
    @RequestMapping("/hits")
    public String hits(Model model) {

        model.addAttribute("hits",++hitCount);
        return "hits";
    }
}
