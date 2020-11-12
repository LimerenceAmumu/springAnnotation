package com.lhp.spring.config;

import com.lhp.spring.bean.Red;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Amumu
 * @create 2019/9/4 18:11
 */
@Configuration
@Import(Red.class)
public class AwareConfig {

}
