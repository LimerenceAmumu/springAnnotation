package com.amumu.conditional;

import com.amumu.aop.MathCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amumu
 * @create 2019/7/30 10:28
 *  @Conditional：
 *      使用地方：
 *          1.标注在bean的创建方法上，满足条件才会注册cibean
 *          2.标注在类上，满足条件才会加载此类中的bean
 *       注册Conitional，实现接口annotation.Condition  和其中的方法.public boolean matches(ConditionContext conditionContext,
 *       AnnotatedTypeMetadata annotatedTypeMetadata)即可
 *
 */
public class TestConditional {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        //获取所有注册的bean
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

            //因为有很多springioc容器自己的bean所以加了一下过滤
            if(beanDefinitionName.contains("Per")){
                System.out.println("beanDefinitionName = " + beanDefinitionName);
            }
        }


    }
}
