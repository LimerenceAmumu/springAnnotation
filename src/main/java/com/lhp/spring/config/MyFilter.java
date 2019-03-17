package com.lhp.spring.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author 李贺鹏
 * @create 2019/3/16 14:20
 */
public class MyFilter implements TypeFilter {
    //MetadataReader:读取到的当前正在扫描到的类的信息
    //MetadataReaderFactory：可以获取到其他任何类的信息
    //匹配成功返回true
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //返回当前类的注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前扫描类的信息（类名，接口，子类，父类等信息）
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的路径等信息
        Resource resource = metadataReader.getResource();
        //打印经过过滤的类的类名
        String className = classMetadata.getClassName();
        System.out.println("className ====> " + className);
        //设定匹配规则： 类名中包含 “ er”
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
