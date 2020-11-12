package com.lhp.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Amumu
 * @create 2019/9/4 18:47
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lhp.spring.aop")
public class AopConfig {
    @Bean("aopBiz")
    public AopBiz getAopBiz(){
        return new AopBiz();
    }
    @Bean("logAspect")
    public LogAspect getLogAspect(){
        return new LogAspect();
    }

}
