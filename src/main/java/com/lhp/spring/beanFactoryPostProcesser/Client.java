package com.lhp.spring.beanFactoryPostProcesser;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/9/5 14:21
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        /*
        * MyBeanFactoryPostProcessor--->postProcessBeanFactory----
            beanFactory 中的定义信息有：9个
            当前所有的bean DefinitionName
            beanDefinitionName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
            beanDefinitionName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
            beanDefinitionName = org.springframework.context.annotation.internalRequiredAnnotationProcessor
            beanDefinitionName = org.springframework.context.annotation.internalCommonAnnotationProcessor
            beanDefinitionName = org.springframework.context.event.internalEventListenerProcessor
            beanDefinitionName = org.springframework.context.event.internalEventListenerFactory
            beanDefinitionName = config
            beanDefinitionName = myBeanFactoryPostProcessor
            beanDefinitionName = blue
            Blue 构造器
            Blue init...
        * */
    }
}
