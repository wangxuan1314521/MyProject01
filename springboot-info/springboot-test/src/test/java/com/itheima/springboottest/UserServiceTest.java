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
