package br.com.unipe.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index"; // This assumes "index.jsp" is in your "src/main/webapp/WEB-INF/views" directory.
    }
}
