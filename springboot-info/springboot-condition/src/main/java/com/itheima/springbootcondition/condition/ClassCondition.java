package com.itheima.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import javax.lang.model.element.VariableElement;
import java.util.List;
import java.util.Set;


/**
 * conditionContext ：上下文对象，用于获取环境，IOC容器，ClassLoader对象
 * Metadata：注解元对象，可以用于获取注解定义的属性值
 *
 * @author shkstart
 * @create 2023-02-23 14:39
 */

//添加一个类，实现@Conditional的接口方法，返回false则说明这个类Spring不进行创建
public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata Metadata) {


        // return  false;
        //需求：导入Jedis坐标后，创建Bean
        //判断redis.clients.jedis.Jedis.class文件是否存在
      /*  boolean flag=true;
        try {
            Class<?> aClass = Class.forName("RedisProperties");
        } catch (ClassNotFoundException e) {
           flag=false;
        }
        return flag;*/


         //需求2 导入通过注解属性值value指定坐标后创建Bean
        //1.获取注解属性值 value 获取自定义注解的全路径名
        MultiValueMap<String, Object> map = Metadata.getAllAnnotationAttributes(CondintionOnClass.class.getName());
        System.out.println(map); //  {value=[[Ljava.lang.String;@a530d0a]}
         String[] value = (String[]) map.get("value").get(0);

       boolean flag = true;
        try {

            for (String s : value) {
                Class<?> aClass = Class.forName(s);
                System.out.println(aClass);
            }

        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;



    }
}
