package com.lhp.spring.bean;

/**
 * @author 李贺鹏
 * @create 2019/3/16 18:09
 */
public class Rain {
    public Rain(){
        System.out.println("Rain 实例化");
    }
    public void initRain(){
        System.out.println("Rain init... ");
    }
    public void destoryRain(){
        System.out.println("Rain destory... ");
    }
}
