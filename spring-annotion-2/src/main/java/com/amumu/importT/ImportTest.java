package com.amumu.importT;

import com.amumu.conditional.ConditionalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/7/30 11:56
 */
public class ImportTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
        //获取所有注册的bean
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
        //虽然在IOc容器中有beanDefinitionName = colorfactoryBean  但是该bena实际上是该工厂所创建的实例也就是com.amumu.domain.Color
        Object colorfactoryBean = annotationConfigApplicationContext.getBean("colorfactoryBean");
        System.out.println("colorfactoryBean = " + colorfactoryBean);
        //如果真的是要获取colorfactoryBean这个实例需要加上 &
        Object colorfactoryBean2 = annotationConfigApplicationContext.getBean("&colorfactoryBean");
        System.out.println("colorfactoryBean2 = " + colorfactoryBean2);
    }
}
