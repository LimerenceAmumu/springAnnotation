package com.amumu.aop;

import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/7/30 10:12
 */
@Component
public class MathCalculator {
    public int cal(int i,int j){
        System.out.println("MathCalculator.cal"+i/j);
        return i/j;
    }
}
