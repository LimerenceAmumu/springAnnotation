package com.lhp.spring.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 李贺鹏
 * @create 2019/3/16 16:22
 */
public class WindowsConditional implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        final String OSName = environment.getProperty("os.name");
        System.out.println("OSName = " + OSName);
        if(OSName.contains("Windows")){
            return true;
        }
        return false;
    }
}
