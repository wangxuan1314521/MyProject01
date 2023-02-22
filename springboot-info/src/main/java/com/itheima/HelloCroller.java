package com.itheima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2023-02-22 12:35
 */

/**
 * @RestController 是@controller和@ResponseBody 的结合
 * @Controller 将当前修饰的类注入SpringBoot IOC容器，使得从该类所在的项目跑起来的过程中，这个类就被实例化。
 * @ResponseBody 它的作用简短截说就是指该类中所有的API接口返回的数据，甭管你对应的方法返回Map或是其他Object，
 * 它会以Json字符串的形式返回给客户端
 */
@RestController
public class HelloCroller {
    //读取配置内容方式1 @Value注解
    @Value("${name}")
    private String name;
    @Value("${persion3.name}")
    private String name3;
    @Value("${persion3.age}")
    private String age;
    //数组
    @Value("${address[0]}")
    private String arr;
    //纯量

    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;

    //读取配置文件方式2，Environment
    //Environment,在springboot初始化后，就会在spring容器中初始化Environment环境对象
    @Autowired
    private Environment env;
    //读取配置文件的方式3   @ConfigurationProperties
    @Autowired
    private Persion persion;


    @RequestMapping("textYml")
    public String hello2() {
        System.out.println("--------@Value方式获取配置文件内容--------");
        System.out.println(name); //abc
        System.out.println(name3);//王五
        System.out.println(age);//66
        System.out.println(arr);//北京
        System.out.println(msg1);//hello \n springboot1
        System.out.println(msg2);/*hello
                                    springboot2
                                  */
        System.out.println("------Environment环境对象获取配置文件内容--------");
        System.out.println(env.getProperty("name"));
        System.out.println("persion3的name:" + env.getProperty("persion3.name"));
        System.out.println("persion3的age:" + env.getProperty("persion3.age"));
        System.out.println("address数组第一个属性值：" + env.getProperty("address[0]"));

        System.out.println("--------在类上单独加@ConfigurationProperties--------");
        System.out.println(persion.getName());//abc
        System.out.println("在类上添加前缀@ConfigurationProperties(prefix = \"persion\")");
        System.out.println(persion.getName());//张三
        System.out.println(persion.getAddress());//[Ljava.lang.String;@783430d2
        System.out.println(persion.getAddress()[0]);//北京
        String[] ar = persion.getAddress();
        for (String s : ar) {
            System.out.print(" " + s);   //北京 天津1
        }


        return "你好";
    }


    @RequestMapping("hi")
    public String hello() {
        System.out.println("hello  SpringBoot自动构建的第一个测试");
        return "你好";

    }
}
