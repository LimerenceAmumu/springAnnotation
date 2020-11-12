package com.lhp.spring.config;

import com.lhp.spring.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author 李贺鹏
 * @create 2019/3/17 19:45
 */
@Configuration
@ComponentScan(value = {"com.lhp.spring.sevice","com.lhp.spring.dao","com.lhp.spring.bean"})
public class MainConfigAutowired {

    @Primary
    @Bean
    public PersonDao personDao(){
        PersonDao personDao = new PersonDao();
        personDao.setName("self");
        return personDao;
    }


}
