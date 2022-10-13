package aop;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 16:26
 * @PACKAGE: diy
 * @Software: IntelliJ IDEA
 */
public class DiyPointCut {
    public void before(){
        System.out.println("=====方法执行前=====");
    }
    public void after(){
        System.out.println("=====方法执行后=====");
    }
}
