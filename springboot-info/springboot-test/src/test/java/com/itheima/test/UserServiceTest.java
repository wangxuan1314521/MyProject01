package com.itheima.test;

/**
 * @author shkstart
 * @create 2023-02-23 10:52
 */

import com.itheima.springboottest.SpringbootTestApplication;
import com.itheima.springboottest.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.StringReader;

/**
 * 编写一个测试类UserServiceTest
 */
@RunWith(SpringRunner.class)
//指定当前引导类的字节码文件：SpringbootTestApplication.class
@SpringBootTest(classes = SpringbootTestApplication.class)
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
