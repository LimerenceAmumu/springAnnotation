package com.amumu.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/7/30 10:54
 */
@Component
public class WindowsCondition implements Condition {
    /**
     *
     * @param conditionContext   判断条件的上下文环境
     * @param annotatedTypeMetadata  注释信息
     * @return 为true时表明符合条件
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //根据conditionContext获取运行环境  包括很多虚拟机的信息
        Environment environment = conditionContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        if(osName.toLowerCase().contains("windows")){
            return true;
        }
        return false;
    }
}
