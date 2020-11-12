package com.lhp.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 李贺鹏
 * @create 2019/3/16 17:11
 * 获取上下文环境
 */
@Component
public class Red implements ApplicationContextAware {
    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext=applicationContext;
    }

}
