package com.amumu.importT;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Amumu
 * @create 2019/7/30 11:58
 */
public class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //
        return new String[] {"com.amumu.domain.Person"};
    }
}
