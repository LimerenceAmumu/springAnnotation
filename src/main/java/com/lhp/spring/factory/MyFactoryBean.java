package com.lhp.spring.factory;

import com.lhp.spring.bean.Love;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 李贺鹏
 * @create 2019/3/16 18:58
 */
public class MyFactoryBean implements FactoryBean<Love> {

    @Override
    public Love getObject() throws Exception {
        //返回Love对象
        return new Love();
    }

    public Class<?> getObjectType() {
        return Love.class;
    }
    //设置是否是单例
    public boolean isSingleton() {
        return true;
    }
}
