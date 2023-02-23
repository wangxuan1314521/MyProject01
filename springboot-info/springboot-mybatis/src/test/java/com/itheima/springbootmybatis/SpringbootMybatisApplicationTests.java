package com.itheima.springbootmybatis;

import com.itheima.springbootmybatis.domain.User;
import com.itheima.springbootmybatis.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
    //在spring测试类注入对应的mapper接口类
    @Autowired

    private UserXmlMapper xmlMapper;
   /* @Autowired
    private UserMapper userMapper;
*/
    @Test
    public void testFindXmlAll() {
        List<User> allXml = xmlMapper.findAll();
        System.out.println(allXml);
        for (User user : allXml) {
            System.out.println(user);

        }
    }


   /* @Test
    public void testFindAll() {
        List<User> all = userMapper.findAll();
        System.out.println(all);
        for (User user : all) {
            System.out.println(user);

        }

    }*/

}


