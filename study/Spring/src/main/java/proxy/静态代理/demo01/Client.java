package proxy.静态代理.demo01;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:03
 * @PACKAGE: demo01
 * @Software: IntelliJ IDEA
 */
public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        Proxy proxy = new Proxy(landlord);
    }
}
