package com.lhp.spring.config;

import com.lhp.spring.bean.Rain;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 李贺鹏
 * @create 2019/3/16 18:08
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean a = registry.containsBeanDefinition("com.lhp.spring.bean.Cat");
        boolean b = registry.containsBeanDefinition("com.lhp.spring.bean.Fish");
        if(a && b){
            //指定bean的定义信息
            RootBeanDefinition beanDefinition =new RootBeanDefinition(Rain.class) ;
            //注册一个bean
            registry.registerBeanDefinition("rain",beanDefinition);

        }
    }
}
