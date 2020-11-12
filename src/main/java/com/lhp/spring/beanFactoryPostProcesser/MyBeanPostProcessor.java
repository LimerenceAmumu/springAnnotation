package com.lhp.spring.beanFactoryPostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**后置处理器
 * @author 李贺鹏
 * @create 2019/3/17 16:18
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 在初始化之前执行
     * */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization...");
        System.out.println("bean"+"---->"+bean);
        System.out.println("beanName"+"---->"+beanName);
        return bean;
    }
    /**
     * 在初始化之后执行
     * */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization...");
        System.out.println("bean"+"---->"+bean);
        System.out.println("beanName"+"---->"+beanName);
        return bean;
    }
}
