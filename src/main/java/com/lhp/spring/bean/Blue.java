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
        System.out.println("Blue 构造器");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Blue init... ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Blue destory... ");
    }
}
