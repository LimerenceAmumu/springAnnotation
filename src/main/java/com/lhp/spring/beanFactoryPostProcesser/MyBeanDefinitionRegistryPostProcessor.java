package com.lhp.spring.beanFactoryPostProcesser;

import com.lhp.spring.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/9/6 9:19
 * BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

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
    //在postProcessBeanFactory 之前 bean定义信息加载之前执行
    //BeanDefinitionRegistry bean的定义信息保存中心，beanfactory就是按照它里面保存的每一个bean 定义信息来创建bean实例的
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor--->postProcessBeanDefinitionRegistry----");
        //给容器中注册bean
        //方式1
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();
        //方式2
        // BeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
        registry.registerBeanDefinition("blue",beanDefinition);


        int beanDefinitionCount = registry.getBeanDefinitionCount();
        System.out.println("beanFactory 中的定义信息有：" + beanDefinitionCount+"个");


    }
}
