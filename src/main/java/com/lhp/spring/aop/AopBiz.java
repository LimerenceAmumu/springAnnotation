package com.lhp.spring.aop;

import org.springframework.stereotype.Service;

/**
 * @author Amumu
 * @create 2019/9/4 18:47
 */

public class AopBiz {
    public int div(int a,int b) throws Exception {
        if(b==0){
            throw new Exception("非法参数");

        }
        return a/b;
    }


}
