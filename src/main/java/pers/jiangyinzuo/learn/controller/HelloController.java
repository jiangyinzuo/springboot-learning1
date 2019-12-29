package pers.jiangyinzuo.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jiang Yinzuo
 */
@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String home() {
        return "index";
    }
}
