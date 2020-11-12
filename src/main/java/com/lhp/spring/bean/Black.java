package com.lhp.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringValueResolver;

/**
 * @author 李贺鹏
 * @create 2019/3/20 16:45
 */
@Component
public class Black implements ApplicationContextAware, EmbeddedValueResolverAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获得ioc容器
        System.out.println("applicationContext = " + applicationContext);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String strRes=resolver.resolveStringValue("my os name is ${os.name},value=#{10*60}");
        System.out.println("strRes = " + strRes);
    }
}
