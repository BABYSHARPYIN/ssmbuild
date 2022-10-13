package proxy.动态代理.demo01;

import tools.ProxyInvocationHandler;
/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:03
 * @PACKAGE: demo01
 * @Software: IntelliJ IDEA
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Landlord landlord = new Landlord();
        //代理角色:目前没有,这个在 invoke 反射生成
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //告诉动态代理类需要反射的对象类型与实现方法
        proxyInvocationHandler.setTarget(landlord);
        //绑定目标类，根据目标类的类加载器和接口创建代理对象，并返回代理对象
        Rent proxy = (Rent) proxyInvocationHandler.bind();
        proxy.rent();
    }
}
