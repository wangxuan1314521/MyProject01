package com.itheima.springbootcondition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 自定义一个注解，完成将类的判断定义为动态的，判断那个字节码文件存在可以动态指定
 * 在自定义注解上加上  @Conditional(ClassCondition.class)
 *
 * 再加上这个原注解定义时候的注解
 * @Target({ElementType.TYPE, ElementType.METHOD})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 *
 *
 *
 * @author shkstart
 * @create 2023-02-23 15:25
 */



@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface CondintionOnClass {
    String[] value();
}
