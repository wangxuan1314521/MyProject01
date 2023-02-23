package com.itheima.springbootenable;

import com.itheima.config.EnableUser;
import com.itheima.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 点进去@SpringBootApplication，出现@ComponentScan
 * @ComponentScan扫描的范围：当前引导类所在包及其子包
 * com.itheima.config;这个包不符合条件，所以报错，No bean named 'user' available没有User类
 * 方式1：@ComponentScan("package com.itheima.config")
 * 方式2：使用@Import注解，加载类
 *
 *
 *
 *生效前提: 引入springboot-enable-other的坐标
 *         <dependency>
 *             <groupId>com.itheima</groupId>
 *             <artifactId>springboot-enable-other</artifactId>
 *             <version>0.0.1-SNAPSHOT</version>
 *             <scope>compile</scope>
 *         </dependency>
 *
 *         运行结果：com.itheima.domain.User@1130520d  成功
 *
 * 第三种方式：在别的module里面定义一个注解类，可以直接引用这个新注解
 * 下面名称叫做@EnableUser
 * 定义：
 *
 @Target({ElementType.TYPE})
 @Retention(RetentionPolicy.RUNTIME)
 @Documented
 @Import(UserConfig.class)
 public @interface EnableUser {

 }

 运行结果：com.itheima.domain.User@f627d13  成功
 */
//@ComponentScan("com.itheima.config")
@SpringBootApplication
//@Import(UserConfig.class)
@EnableUser
public class SpringbootEnableApplication {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootEnableApplication.class, args);
        Object user = run.getBean("user");
        System.out.println(user);



    }

}
