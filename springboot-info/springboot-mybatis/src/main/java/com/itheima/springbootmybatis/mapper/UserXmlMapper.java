package com.itheima.springbootmybatis.mapper;

import com.itheima.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @create 2023-02-23 12:55
 */
@Mapper
@Repository
@Component
public interface UserXmlMapper {

    public List<User> findAll();

}
