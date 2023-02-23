package com.itheima.springbootcondition;

import com.itheima.springbootcondition.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {
        //启动SpringBoot的应用，并返回Spring容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
        //获取Bean，redisTemplate
      //  Object redisTemplate = context.getBean("redisTemplate");
        //org.springframework.data.redis.core.RedisTemplate@1e044120
       //先注释掉 System.out.println(redisTemplate);
        Object user = context.getBean("user");
        //com.itheima.springbootcondition.domain.User@2d10e0b1
        System.out.println(user);





    }


}
