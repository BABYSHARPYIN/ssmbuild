package mapper;

import org.mybatis.spring.SqlSessionTemplate;
import pojo.User;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 18:57
 * @PACKAGE: mapper
 * @Software: IntelliJ IDEA
 */
public class UserMapperImpl implements UserMapper{
    //之前的操作是使用 sqlSession 执行,现在使用 sqlSessionTemplate 执行
    private SqlSessionTemplate sqlSessionTemplate;
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    @Override
    public List<User> selectUsers() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.selectUsers();
        User user = new User();
        user.setId(5);
        user.setName("小王");
        user.setPassword("233333");
        mapper.addUser(user);
        mapper.deleteUserById(4);
        return users;
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.deleteUserById(id);
    }


}
