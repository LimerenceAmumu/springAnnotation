package com.amumu.importT;

import com.amumu.domain.Rain;
import com.amumu.domain.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Amumu
 * @create 2019/7/30 11:56
 */
@Configuration
@ComponentScan("com.amumu.importT")
@Import({Red.class, Rain.class,MySelector.class,MyBeanDefineRegister.class})//Class<?>[] value();
public class ImportConfig {
    @Bean
    public  ColorfactoryBean colorfactoryBean(){
        return new ColorfactoryBean();

    }
}
