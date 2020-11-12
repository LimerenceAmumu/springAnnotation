package com.lhp.spring.applicationListener;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Amumu
 * @create 2019/9/8 8:08
 */
@Configuration
@Import(MyApplicationListener.class)
public class Config {
}
