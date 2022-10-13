package proxy.动态代理.demo01;

import org.apache.log4j.Logger;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:02
 * @PACKAGE: demo01
 * @Software: IntelliJ IDEA
 */
public class Landlord implements Rent {
    Logger logger = Logger.getLogger(Landlord.class);
    @Override
    public void rent(){
        logger.info("出租");
    }
}
