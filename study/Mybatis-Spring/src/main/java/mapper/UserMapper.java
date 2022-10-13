package mapper;

import pojo.User;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 17:18
 * @PACKAGE: mapper
 * @Software: IntelliJ IDEA
 */
public interface UserMapper {
    public List<User> selectUsers();

    public int addUser(User user);

    public int deleteUserById(int id);
}
