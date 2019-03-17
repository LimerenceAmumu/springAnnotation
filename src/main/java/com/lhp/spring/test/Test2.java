package com.lhp.spring.test;

import com.lhp.spring.config.MainConfig2;
import com.lhp.spring.config.MainConfigur1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 李贺鹏
 * @create 2019/3/16 15:06
 */
public class Test2 {
    @Test
    /**
     * 单例模式下
     *          @lazy  对象在被调用的时候初始化
     *          不注明lazy 或者@lazy("false")   在ioc 初始化的时候直接加载
     */
    public void test2(){
        System.out.println("注解类方式");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("IOC init...");
       /* String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

        }*/

        Object person = annotationConfigApplicationContext.getBean("person");
        System.out.println("person = " + person.toString());


    }

    /***
     *
     */
    @Test
    public void test3(){
        System.out.println("测试 Conditional");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }


    }

    @Test
    public void testImport(){
        //@Import(value = {Blue.class, Red.class})
        System.out.println("测试 @Import");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }


    }
    //@Import(value = {Blue.class, Red.class,MySelector.class})
    @Test
    public void testImportSelector(){
        System.out.println("测试 @ImportSelector");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }


    }
    //@Import(value = {Blue.class, Red.class,MySelector.class,MyImportBeanDefinitionRegistrar.class})
    @Test
    public void testMyImportBeanDefinitionRegistrar(){
        System.out.println("测试 @MyImportBeanDefinitionRegistrar");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }


    }
    //利用FactoryBean
    @Test
    public void testFactoryBean(){
        System.out.println("测试 FactoryBean");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);//beanDefinitionName = getFactory

        }
        Object getFactory = annotationConfigApplicationContext.getBean("getFactory");
        //默认获得的是factoryBean创建的对象
        System.out.println("getFactory = " + getFactory);//getFactory = com.lhp.spring.bean.Love@7219ec67
        //id前加上 & 获得factoryBean本身
        Object getFactoryBean = annotationConfigApplicationContext.getBean("&getFactory");
        System.out.println("&getFactoryBean = " + getFactoryBean);//&getFactoryBean = com.lhp.spring.factory.MyFactoryBean@45018215




    }
}
