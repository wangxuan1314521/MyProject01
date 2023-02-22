package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2023-02-22 11:45
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "hello spring";
    }
}
