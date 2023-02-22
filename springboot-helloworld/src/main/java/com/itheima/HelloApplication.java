package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导类，spring boot项目的入口
 *
 * @author shkstart
 * @create 2023-02-22 12:05
 */
//①加注解
@SpringBootApplication
public class HelloApplication {
    //将来运行spring boot项目直接运行main方法就可以了
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
