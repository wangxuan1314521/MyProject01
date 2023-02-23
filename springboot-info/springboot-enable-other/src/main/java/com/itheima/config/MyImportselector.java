package com.itheima.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author shkstart
 * @create 2023-02-23 19:29
 * @import 导入ImportSelector接口的实现类，创建实现类MyImportselector，一般用于加载配置文件中的类
 */
public class MyImportselector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //传入数据
        return new String[]{"com.itheima.domain.Role","com.itheima.domain.User"};
    }
}
