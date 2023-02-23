package com.itheima.springbootenable;

import com.itheima.config.EnableUser;
import com.itheima.config.MyImportBeanDefinitionRegistrar;
import com.itheima.config.MyImportselector;
import com.itheima.config.UserConfig;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import javax.lang.model.element.VariableElement;
import java.util.Map;

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



//1.@ComponentScan("com.itheima.config")
//@Enable注解底层使用@Import注解
//2.@Import(UserConfig.class)
//自定义的接口
//3.@EnableUser
/*public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootEnableApplication.class, args);
        //获取Bean
        Object user = run.getBean("user");
        System.out.println(user);
    }

}
*/


/**
 * Import4种用法
 * 1.导入Bean   @Import(User.class)
 * 2.导入配置类 @Import(UserConfig.class),可以配置加载配置类中的多个Bean
 * 3.导入ImportSelector接口的实现类  @Import(MyImportselector.class)
 * 4.导入ImportBeanDefinitionRegistrar接口 的实现类
  */

@SpringBootApplication

//@Import(User.class)
//@Import(UserConfig.class)
//@Import(MyImportselector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public class SpringbootEnableApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext run = SpringApplication.run(SpringbootEnableApplication.class, args);
       /*
         1.获取Bean
       Object user = run.getBean("user");
        System.out.println(user);
        */
       //2.根据类来获取Bean
        User user = run.getBean(User.class);
       // Role role = run.getBean(Role.class);
        //com.itheima.domain.User@895e367
        System.out.println(user);
        //MyImportBeanDefinitionRegistrar.class定义的user名字：com.itheima.domain.User@589da3f3
         Object user1 = run.getBean("user");
        System.out.println("MyImportBeanDefinitionRegistrar.class定义的user名字："+user1);



        // com.itheima.domain.Role@4bd31064
       // System.out.println(role);






       /* 包名.类名=值  ：{com.itheima.domain.User=com.itheima.domain.User@895e367}
        Map<String, User> beansOfType = run.getBeansOfType(User.class);
        System.out.println(beansOfType);*/

    }

}
