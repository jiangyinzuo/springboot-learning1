package pers.jiangyinzuo.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiang Yinzuo
 */
@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String home() {
        return "Hello World!";
    }
}
