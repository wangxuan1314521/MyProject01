package com.itheima.springboottest;

import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2023-02-23 10:50
 */

/**
 * @Service标明业务类，进行测试，整合JUNIT
 */
@Service
public class UserService {
    public void add(){
        System.out.println("add...测试");
    }
}
