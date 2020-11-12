package com.amumu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/7/30 10:14
 */
@Aspect
@Component
public class AspectDemo {
    @Pointcut("execution(* com.amumu.aop.*.*(..))")
    public void pointCut(){}
   // @Before(value = "pointCut()")
    public void beforeCal(JoinPoint joinPoint){
        System.out.println("before");
        String args = joinPoint.getArgs().toString();
        System.out.println("args = " + args);
    }
    //@After(value = "pointCut()")
    public void afterCal(JoinPoint joinPoint){
        System.out.println("afterCal");
        System.out.println(joinPoint.getSignature().getName());
    }
    //@AfterReturning(value = "pointCut()",returning = "score")
    public void afterReturning(JoinPoint joinPoint,Object score){
        System.out.println("afterReturning");
        System.out.println("score------"+score);
    }
    @Around(value = "pointCut()")
    public Object aroundCal(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("AAAAAAAAAA");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("BBBBBBBBBB");
        return proceed;
    }
}
