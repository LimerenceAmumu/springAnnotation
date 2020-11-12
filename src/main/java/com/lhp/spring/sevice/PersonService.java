package com.lhp.spring.sevice;

import com.lhp.spring.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author 李贺鹏
 * @create 2019/3/16 13:14
 */
@Service
public class PersonService {


    @Qualifier("personDao")//明确指定要装配的组件id
    @Autowired
    private PersonDao personDao;
    public void print(){
        System.out.println(personDao);
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "personDao=" + personDao +
                '}';
    }
}
