package com.lhp.spring.beanFactoryPostProcesser;

import com.lhp.spring.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Amumu
 * @create 2019/9/5 14:19
 */
@Configuration
@ComponentScan("com.lhp.spring.beanFactoryPostProcesser")
public class Config {
    @Bean("blue")
    public Blue getBlue(){
        return new Blue();
    }

}
