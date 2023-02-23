package com.itheima.springboottest;

/**
 * @author shkstart
 * @create 2023-02-23 10:52
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 编写一个测试类UserServiceTest
 */
@RunWith(SpringRunner.class)
//当前测试类的包，是引导类主包名或者及其子包名，则测试类中的classes不需要指定
@SpringBootTest()
public class UserServiceTest {
    //测试注入UserService
    @Autowired
    private UserService userService;
    //打印添加方法
    @Test
    public void testAdd(){

       userService.add();
    }
}
