package com.lhp.spring.test;

import com.lhp.spring.config.AwareConfig;
import com.lhp.spring.config.MainConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Amumu
 * @create 2019/7/29 10:27
 */

public class TestAware {
    @Test
    public void test(){
        System.out.println("aware");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);

    }
}
