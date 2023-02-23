package com.itheima.config;

import com.itheima.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2023-02-23 18:12
 * （1）@Configration 注解：用于声明当前类是一个配置类，
 * 相当于Spring中的一个 XML 文件；相当XML文件中的标签
 * （2）@Bean 注解：作用在方法上，声明当前方法的返回值是一个Bean对象；
 * 相当XML文件中的标签。
 */

@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User();
    }


}
