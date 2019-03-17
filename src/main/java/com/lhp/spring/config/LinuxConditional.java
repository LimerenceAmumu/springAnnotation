package com.lhp.spring.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 李贺鹏
 * @create 2019/3/16 16:37
 */
public class LinuxConditional implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        final String OsName = environment.getProperty("os.name");
        if(OsName.contains("linux")){
            return true;
        }
        return false;
    }
}
