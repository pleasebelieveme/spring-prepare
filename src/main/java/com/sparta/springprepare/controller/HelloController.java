package com.sparta.springprepare.controller;

/* 여기까지 스프링 입문 1-9
@RestController
public class HelloController {
    
    @GetMapping("/api/hello")
    public String hello() {
         return "Hello World!";
    }
}
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
         return "Hello World"; // @Controller가 붙었을때 String으로 반환하면 resources쪽의 html파일을 찾는다 -> 의도와 다르다면 @ResponseBody를 적
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET 메서드 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST 메서드 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT 메서드 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE 메서드 요청";
    }
}