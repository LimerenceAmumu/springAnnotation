package com.lhp.spring.config;

import com.lhp.spring.bean.Rain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李贺鹏
 * @create 2019/3/17 14:26
 */
@Configuration
@ComponentScan(value = "com.lhp.spring")
public class MainConfigLifeCycle {
    @Bean(value = "myRain",initMethod = "initRain",destroyMethod = "destoryRain")
    public Rain rain(){
        return new Rain();
    }
}
