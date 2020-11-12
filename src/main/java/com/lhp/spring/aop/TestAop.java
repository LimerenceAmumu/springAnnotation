package com.lhp.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/9/4 19:10
 */
public class TestAop {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        AopBiz bean = annotationConfigApplicationContext.getBean(AopBiz.class);
        int div = bean.div(9, 3);
        System.out.println(div);

    }
}
