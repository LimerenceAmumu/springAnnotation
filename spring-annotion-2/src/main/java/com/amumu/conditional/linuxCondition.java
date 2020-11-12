package com.amumu.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/7/30 11:01
 */
@Component
public class linuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //根据conditionContext获取运行环境  包括很多虚拟机的信息
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if(osName.toLowerCase().contains("linux")){
            return true;
        }
        //还可以获取以下信息
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        ClassLoader classLoader = context.getClassLoader();
        BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();
        return false;
    }
}
