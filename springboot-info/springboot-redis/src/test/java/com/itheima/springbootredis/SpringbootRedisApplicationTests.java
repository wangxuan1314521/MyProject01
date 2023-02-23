package com.itheima.springbootredis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.lang.model.element.VariableElement;

@SpringBootTest
public class SpringbootRedisApplicationTests {
   //只有本机的redis才不进行配置。
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet() {
        //调用模板数据进行操作
        //存入数据
        redisTemplate.boundValueOps("name").set("张三");
    }

    @Test
    public void testGet() {
        //获取数据
        Object name=redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }
}
