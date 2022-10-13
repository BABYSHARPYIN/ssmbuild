package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 16:33
 * @PACKAGE: aop
 * @Software: IntelliJ IDEA
 */
//方式三: 使用注解实现 aop
@Aspect//标注为切面
public class AnnotationPointCut {
    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====方法执行后=====");
    }


    //在环绕增强中,我们可以给定一个参数,代表我们要获取的切入点
    @Around("execution(* service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=====方法环绕前=====");
        System.out.println(joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        System.out.println("=====方法环绕后=====");

    }

}
