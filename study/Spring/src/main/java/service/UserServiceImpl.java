package service;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 15:38
 * @PACKAGE: service
 * @Software: IntelliJ IDEA
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");

    }

    @Override
    public void update() {
        System.out.println("修改用户");

    }

    @Override
    public void query() {
        System.out.println("查询用户");

    }
}
