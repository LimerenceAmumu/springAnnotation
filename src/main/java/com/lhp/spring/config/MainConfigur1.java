package com.lhp.spring.config;

import com.lhp.spring.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;



/**
 * @author 李贺鹏
 * @create 2019/3/16 12:57
 * 测试扫描及自定义扫描
 */
@Configuration//告诉spring这是一个 配置类，作用等同于xml
/*
@ComponentScan(value="com.lhp.spring",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})//excludeFilters=Filter[] 利用excludeFilters 排除不需要扫描的类，
*/
/*@ComponentScan(value="com.lhp.spring",useDefaultFilters = false,includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})*/
//excludeFilters=Filter[] 利用excludeFilters 排除不需要扫描的类，也可以替换为includeFilters，只扫描某些类，但是需要关闭默认的

//如果需要定义多个扫描规则可以使用@@ComponentScans
/*@ComponentScans(value = {
        @ComponentScan(value="com.lhp.spring",useDefaultFilters = false,excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
        }),@ComponentScan(value="com.lhp.spring",useDefaultFilters = false,excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class})
})



}
)*/
//设定自己的扫描策略
@ComponentScans(value = {
        @ComponentScan(value = "com.lhp.spring",includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilter.class})
        })
})
public class MainConfigur1 {
    //给容器注册一个bean，类型是返回值，id默认是方法名，可以通过给@bean赋值 自定义
    @Bean("person")
    public Person person01(){
        return new Person("config",23);
    }
}
