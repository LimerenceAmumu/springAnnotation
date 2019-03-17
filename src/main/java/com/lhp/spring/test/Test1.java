package com.lhp.spring.test;

import com.lhp.spring.config.MainConfigur1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李贺鹏
 * @create 2019/3/16 12:00
 */
public class Test1 {
    //通过加载配置文件
    @Test
    public void test1(){
        System.out.println("xml方式");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object person = classPathXmlApplicationContext.getBean("person");
        System.out.println("person = " + person);
    }
    //通过注解类
    @Test
    public void test2(){

        System.out.println("注解类方式");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigur1.class);
        Object person = annotationConfigApplicationContext.getBean("person");
        System.out.println("person.toString() = " + person.toString());


    }
    //检查是否扫描了Controller
    @Test
    public void test3(){
        System.out.println("扫描");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigur1.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
            /**1. 排除controller
             * resultL:
             * beanDefinitionName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalCommonAnnotationProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerFactory
             * beanDefinitionName = mainConfigur
             * beanDefinitionName = personDao
             * beanDefinitionName = personService
             * beanDefinitionName = person
             *2. 只扫描controller
             *扫描
             * beanDefinitionName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalCommonAnnotationProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerFactory
             * beanDefinitionName = mainConfigur
             * beanDefinitionName = personController
             * beanDefinitionName = person
             * 3. @CompentScans
             *
             * beanDefinitionName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalCommonAnnotationProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerFactory
             * beanDefinitionName = mainConfigur
             * beanDefinitionName = person
             * 4. 自定义扫描类名中包含 er（理论上会过滤Dao）
             *
             * className ====> com.lhp.spring.bean.Person
             * className ====> com.lhp.spring.config.MyFilter
             * className ====> com.lhp.spring.Test1.Test1
             * beanDefinitionName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
             * beanDefinitionName = org.springframework.context.annotation.internalCommonAnnotationProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerProcessor
             * beanDefinitionName = org.springframework.context.event.internalEventListenerFactory
             * beanDefinitionName = mainConfigur
             * beanDefinitionName = person
             * beanDefinitionName = myFilter
             * beanDefinitionName = personController
             * beanDefinitionName = personDao
             * beanDefinitionName = personService
             *
             * */
        }


    }

}
