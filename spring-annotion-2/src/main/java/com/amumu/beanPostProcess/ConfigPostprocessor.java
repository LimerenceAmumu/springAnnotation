package com.amumu.beanPostProcess;

import com.amumu.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Amumu
 * @create 2019/7/30 18:32
 */
@Configuration
@ComponentScan("com.amumu.beanPostProcess")
public class ConfigPostprocessor {
    @Bean
    Person getPerson(){
        return new Person();
    }
}
