package com.lhp.spring.test;

import com.lhp.spring.config.MainConfigAutowired;
import com.lhp.spring.dao.PersonDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 李贺鹏
 * @create 2019/3/17 20:15
 */
public class TestAutoWried {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfigAutowired.class);
        Object personDao = annotationConfigApplicationContext.getBean("personDao");
        System.out.println("personService = " + personDao.toString());//personService = PersonDao{name='2'}

    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfigAutowired.class);
        System.out.println("annotationConfigApplicationContext = " + annotationConfigApplicationContext);

    }
}
