package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")  //localhost:8080/hello 접근 시 해당 메소드 호출
    public String hello(Model model){
        model.addAttribute("data", "hello!!!");
        return "hello";  //templates/hello.html 로 이동
    }
}
