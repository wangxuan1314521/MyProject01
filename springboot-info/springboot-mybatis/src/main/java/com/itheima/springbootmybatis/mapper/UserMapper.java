package com.itheima.springbootmybatis.mapper;
import com.itheima.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author shkstart
 * @create 2023-02-23 12:15
 */
//@Repository注解可以标记在任何的类上,用来表明该类是用来执行与数据库相关的操作(即dao对象)

@Component("UserMapper")
@Repository
@Mapper
public interface UserMapper {

    @Select("select * from t_user")

   public List<User> findAll();
}
