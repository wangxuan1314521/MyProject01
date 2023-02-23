package com.itheima.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author shkstart
 * @create 2023-02-23 18:40
 */
/**
 * 提供一个注解类，自己导入 @Import(UserConfig.class)
 * 期原注解也加上
 * @Target({ElementType.TYPE})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(UserConfig.class)
public @interface EnableUser {

}
