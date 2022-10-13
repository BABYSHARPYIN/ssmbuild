package utils;
import org.jetbrains.annotations.NotNull;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/9 10:26
 * @PACKAGE: utils
 * @Software: IntelliJ IDEA
 */
public class Log implements MethodBeforeAdvice{
    /**
     * Callback before a given method is invoked.
     *
     * @param method the method being invoked
     * @param args   the arguments to the method
     * @param target the target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    public void before(Method method, @NotNull Object[] args, Object target) throws Throwable {
        System.out.printf("=====执行方法: %s 参数: %s this指向: %s=====%n", method.getName(), Arrays.toString(args),target);
    }
}
