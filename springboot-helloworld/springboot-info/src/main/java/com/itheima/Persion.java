package com.itheima;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2023-02-22 14:13
 */

/**
 * 如果@ConfigurationProperties 在配置文件发现有单独name命名的属性， 那么就不会找对象格式
 * persion:
 * name: 20
 * age: 张三
 * 这种对象格式的name,  而是直接将name: abc  这种格式的name值注入到Persion类里的name
 */


@ConfigurationProperties(prefix = "persion")
@Component  //表示这个类被spring识别，它是一个Bean
public class Persion {
    private String name;
    private String age;
    private String address[];

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
