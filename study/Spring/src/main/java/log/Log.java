package log;


import org.jetbrains.annotations.NotNull;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 15:40
 * @PACKAGE: log
 * @Software: IntelliJ IDEA
 */

public class Log implements MethodBeforeAdvice {

    @Override
    /**
     * method: 要执行的目标对象方法
     * args: 参数
     * target:目标对象
     * */
    public void before(Method method, @NotNull Object[] args, Object target) throws Throwable {
        System.out.printf("%s 的 %s 被执行了%n", target.getClass().getName(),method.getName());
    }







}
