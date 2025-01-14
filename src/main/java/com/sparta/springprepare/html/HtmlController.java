package com.sparta.springprepare.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/static-hello")
    public String hello() {
         return "hello.html"; // 타임리프라이브러리를 적용하면 resources/templates에서 파일을 찾는다. -> 타임리프를 미적용하면 페이지 반환 성공
    }

    // 타임리프를 적용안해도 가능. 리다이렉트(재접근) /resources/static
    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    // 타임리프 적용 resources/templates
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    // 동적페이지 처리
    private static long visitCount = 0;

    @GetMapping("html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }

}
