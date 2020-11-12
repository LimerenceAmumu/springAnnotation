package com.amumu.beanPostProcess;

import com.amumu.importT.ImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/7/30 18:31
 */
public class TestPostProcessor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigPostprocessor.class);
        //获取所有注册的bean
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames){
            System.out.println("beanDefinitionName = " + beanDefinitionName);

        }

    }
}
