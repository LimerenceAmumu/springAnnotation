package com.amumu.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Amumu
 * @create 2019/7/30 10:11
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan(value = {"com.amumu.aop"})
public class AOPConfig {

}
