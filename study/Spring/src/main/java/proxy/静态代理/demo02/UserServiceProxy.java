package proxy.静态代理.demo02;

import org.apache.log4j.Logger;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 11:23
 * @PACKAGE: proxy.静态代理
 * @Software: IntelliJ IDEA
 */
public class UserServiceProxy implements UserService{

    Logger logger = Logger.getLogger(UserServiceImpl.class);
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("adding");
        userService.add();
    }

    @Override
    public void delete() {
        log("deleting");
        userService.delete();
    }

    @Override
    public void update() {
        log("updating");
        userService.update();
    }

    @Override
    public void query() {
        log("querying");
        userService.query();
    }
    //日志方法
    public void log(String message) {
        logger.info(message);
    }

}
