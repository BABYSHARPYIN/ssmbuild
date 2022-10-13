package proxy.静态代理.demo02;


import org.apache.log4j.Logger;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:16
 * @PACKAGE: proxy.静态代理
 * @Software: IntelliJ IDEA
 */
public class UserServiceImpl implements UserService{
    Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Override
    public void add() {
        logger.info("新增用户");
    }

    @Override
    public void delete() {
        logger.info("删除用户");
    }

    @Override
    public void update() {
        logger.info("更新用户");
    }

    @Override
    public void query() {
        logger.info("查询用户");

    }
}
