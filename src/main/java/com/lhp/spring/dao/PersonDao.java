package com.lhp.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 李贺鹏
 * @create 2019/3/16 13:15
 */
@Repository
public class PersonDao {
    private String name="2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDao{" +
                "name='" + name + '\'' +
                '}';
    }
}
