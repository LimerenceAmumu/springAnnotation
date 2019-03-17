package com.lhp.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author 李贺鹏
 * @create 2019/3/16 17:11
 */
@Component
public class Blue implements InitializingBean, DisposableBean {
    public Blue(){
        System.out.println("Blue 实例化");
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("Blue init... ");
    }

    public void destroy() throws Exception {
        System.out.println("Blue destory... ");
    }
}
