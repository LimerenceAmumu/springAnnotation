package com.amumu.importT;

import com.amumu.domain.Love;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Amumu
 * @create 2019/7/30 14:39
 */
public class MyBeanDefineRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        BeanDefinition beanDefinition = new RootBeanDefinition(Love.class);

        registry.registerBeanDefinition("myImportingClassMetadata",beanDefinition);
    }
}
