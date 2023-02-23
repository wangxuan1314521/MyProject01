package com.itheima.springbootconfig;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2023-02-23 9:50
 */
@RestController
public class ConfigController {
    @RequestMapping("/helloConfig")
    public String hello(){
        System.out.println("hello springboot config");

        return "hello config";
    }
}
