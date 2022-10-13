package proxy.静态代理.demo01;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:05
 * @PACKAGE: Proxy
 * @Software: IntelliJ IDEA
 */
public class Proxy implements Rent{
    private Landlord landlord;
    public Proxy(){}
    public Proxy(Landlord landlord) {
        this.landlord = landlord;
        rent();//在有参构造内就把事情给做了
    }

    @Override
    public void rent() {//代理模式精髓,代理者继承接口由代理者实际操作业务
        landlord.rent();
    }
}
