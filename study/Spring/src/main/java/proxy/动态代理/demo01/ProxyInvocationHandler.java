package tools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 14:08
 * @Software: IntelliJ IDEA
 */
//使用该类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;//被代理接口
    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * Proxy提供了创建动态代理类和实例的静态方法，它也是由这些方法创建的所有动态代理类的超类。
     * 为某个接口创建代理Foo ：
     * <p>
     * InvocationHandler handler = new MyInvocationHandler(...);
     * Class<?> proxyClass = Proxy.getProxyClass(Foo.class.getClassLoader(), Foo.class);
     * Foo f = (Foo) proxyClass.getConstructor(InvocationHandler.class).
     * newInstance(handler);
     * 或更简单地：
     * Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
     * new Class<?>[] { Foo.class },
     * handler);
     */
    public Object bind() {//绑定目标类，根据目标类的类加载器和接口创建代理对象，并返回代理对象
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    //处理代理实例,并返回结果(增强方法)
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("执行了%s方法%n", method.getName());//反射很万能同时是危险的
        return method.invoke(target, args);
    }
}
