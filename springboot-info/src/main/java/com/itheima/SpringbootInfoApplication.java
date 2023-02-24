package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootInfoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootInfoApplication.class, args);
    }

}





/*
打成war包的方式演示
首先将pom.xml加上
<package>war</package>
<！--给war包起别名-->
<build>
<finalName>springboot</finalName>
</build>


@SpringBootApplication
public class SpringbootInfoApplication extends SpringBootServerInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootInfoApplication.class, args);
    }

    @override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
    return builder.sources(SpringbootDeployApplication.class);

    }

}*/