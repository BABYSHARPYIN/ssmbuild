package proxy.静态代理.demo01;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:02
 * @PACKAGE: demo01
 * @Software: IntelliJ IDEA
 */
public class Landlord implements Rent{//在静态代理模式中是否继承接口其实并不重要,这里只是提供一个协议的规范
    @Override
    public void rent(){
        System.out.println("出租");
    }
}
