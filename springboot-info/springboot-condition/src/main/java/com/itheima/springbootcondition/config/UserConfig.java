package com.itheima.springbootcondition.config;

import com.alibaba.fastjson.JSON;
import com.itheima.springbootcondition.condition.ClassCondition;
import com.itheima.springbootcondition.condition.CondintionOnClass;
import com.itheima.springbootcondition.domain.User;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2023-02-23 14:25
 */
@Configuration


public class UserConfig {
    /**@Bean 注解：作用在方法上，声明当前方法的返回值是一个Bean对象
    /@Bean注解标注在方法上，用于告诉方法去产生一个Bean对象，
     ，产生这个Bean对象的方法Spring只会调用一次。
     可以使用@Autowired或者@Resource注解获取Bean*/

    //配置类，加载User相关的Bean
 /*   @Bean
    @Conditional(ClassCondition.class)
    public User user() {

        return new User();
    }*/

  //自定义@CondintionOnClass注解，实现类的判断定义为动态的
   @Bean
    @CondintionOnClass("com.alibaba.fastjson.JSON")
    public User user() {

        return new User();
    }




}
