package com.lhp.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
 * @author Amumu
 * @create 2019/7/29 10:16
 */
@Component
public class TestAware implements ApplicationContextAware, BeanNameAware, BeanClassLoaderAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("==============================");
        System.out.println("ApplicationContextAware");
        String applicationName = applicationContext.getApplicationName();
        System.out.println("applicationName = " + applicationName);
        System.out.println("==============================");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("==============================");

        System.out.println("name = " + name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("==============================");

        String string = classLoader.toString();
        System.out.println("string = " + string);
        System.out.println("==============================");


    }
}
