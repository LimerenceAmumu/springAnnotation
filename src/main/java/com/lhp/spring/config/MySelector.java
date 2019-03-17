package com.lhp.spring.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 李贺鹏
 * @create 2019/3/16 17:12
 */
public class MySelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.lhp.spring.bean.Cat","com.lhp.spring.bean.Fish"};
    }
}
