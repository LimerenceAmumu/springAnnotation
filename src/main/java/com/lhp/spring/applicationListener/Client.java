package com.lhp.spring.applicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/9/8 8:08
 */
public class Client {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        annotationConfigApplicationContext.publishEvent(new ApplicationEvent(new String("我的事件111")) {
        });
        annotationConfigApplicationContext.close();
    }
}
