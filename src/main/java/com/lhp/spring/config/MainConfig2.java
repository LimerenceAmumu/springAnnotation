package com.lhp.spring.config;

import com.lhp.spring.bean.Blue;
import com.lhp.spring.bean.Love;
import com.lhp.spring.bean.Person;
import com.lhp.spring.bean.Red;
import com.lhp.spring.factory.MyFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.*;

/**
 * @author 李贺鹏
 * @create 2019/3/16 14:51
 */
@Configuration
@Import(value = {Blue.class, Red.class,MySelector.class,MyImportBeanDefinitionRegistrar.class})

public class MainConfig2 {
   // @Lazy//使用后默认为true
    //@Scope(value = "prototype")
    @Bean("person")
    public Person person(){

        System.out.println("Person 实例被创建---");
        return new Person("scopeTest",22);
    }
    @Conditional({LinuxConditional.class})
    @Bean("linus")
    public Person person1(){
        System.out.println("linus 实例被创建---");
        return new Person("linus",22);
    }
    @Conditional({WindowsConditional.class})
    @Bean("windows")
    public Person person2(){
        System.out.println("windows 实例被创建---");
        return new Person("windows",22);
    }

    @Bean
    public FactoryBean<Love> getFactory(){

        return new MyFactoryBean();

    }

}
