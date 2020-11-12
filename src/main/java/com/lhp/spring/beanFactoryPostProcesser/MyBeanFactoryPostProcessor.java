package com.lhp.spring.beanFactoryPostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/9/5 14:13
 * Modify the application context's internal bean factory after its standard
 * 	 initialization. All bean definitions will have been loaded, but no beans
 * 	will have been instantiated yet.
 * 	bean factory 初始化过后，加载完所有的bean definitions 之后 创建bean实例之前
 *
 */

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor--->postProcessBeanFactory----");
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("beanFactory 中的定义信息有：" + beanDefinitionCount+"个");

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("当前所有的bean DefinitionName");
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

    }

    //在postProcessBeanFactory 之前执行
    //    All regular bean definitions will have been loaded,
    //	 * but no beans will have been instantiated yet

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor--->postProcessBeanDefinitionRegistry----");


    }
}
