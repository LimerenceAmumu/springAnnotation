package com.lhp.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 李贺鹏
 * @create 2019/3/16 17:17
 */
@Component
public class Cat {
    public Cat() {
        System.out.println("Cat 构造");
    }
    @PostConstruct
    public void init(){
        System.out.println("Cat init");
    }
    @PreDestroy
    public void destrory(){
        System.out.println("Cat destrory");
    }
}
