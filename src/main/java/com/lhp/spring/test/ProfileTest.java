package com.lhp.spring.test;

import com.lhp.spring.config.ProfileConfig;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author 李贺鹏
 * @create 2019/3/21 14:23
 */
public class ProfileTest {
    @Test
    public void testProfile(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProfileConfig.class);
        /*Object dataSource = annotationConfigApplicationContext.getBean("dataSource");
        System.out.println("dataSource = " + dataSource);*/
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

    }
}
