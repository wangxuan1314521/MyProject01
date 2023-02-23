package com.itheima.config;

import com.itheima.domain.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author shkstart
 * @create 2023-02-23 19:43
 *  @Import的第四种用法  ：导入ImportBeanDefinitionRegistrar接口 的实现类
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        AbstractBeanDefinition beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("user",beanDefinitionBuilder);
    }
}
