package proxy.静态代理.demo02;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:03
 * @PACKAGE: demo02
 * @Software: IntelliJ IDEA
 */
public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(new UserServiceImpl());
        userServiceProxy.update();
    }
}
