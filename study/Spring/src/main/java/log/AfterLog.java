package log;


import org.jetbrains.annotations.NotNull;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 15:40
 * @PACKAGE: log
 * @Software: IntelliJ IDEA
 */

public class AfterLog implements AfterReturningAdvice {


    /**
     * Callback after a given method successfully returned.
     *
     * @param returnValue the value returned by the method, if any
     * @param method      the method being invoked
     * @param args        the arguments to the method
     * @param target      the target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    public void afterReturning(Object returnValue, Method method, @NotNull Object[] args, Object target) throws Throwable {
        System.out.printf("%s 的 %s 执行完成了,返回值是: %s%n", target.getClass().getName(),method.getName(),returnValue);
    }
}
