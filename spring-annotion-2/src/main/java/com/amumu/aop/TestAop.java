package com.amumu.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/7/30 10:28
 */
public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
        MathCalculator bean = annotationConfigApplicationContext.getBean(MathCalculator.class);
        int cal = bean.cal(5, 2);
        System.out.println("cal = " + cal);

    }
}
