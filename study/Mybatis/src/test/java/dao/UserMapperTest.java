package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import pojo.User;
import pojo.UserForResultMap;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/26 16:57
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */

public class UserMapperTest {
    //使用 log4j
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserForAnnotation() {//通过注解查询
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userForAnnotation = userMapper.getUserForAnnotation();
            for (User user : userForAnnotation) {
                System.out.println(user);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        sqlSession.close();
    }

    @Test
    public void selectUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    /**
     * 该查询将查询出的数据库字段 pwd 转为 password,这里的工作归功于 UserMapper.xml 中的resultMap
     * */
    public void selectUsersForResultMap() {//为MybatisResultMap 测试查询所有用户
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserForResultMap> users = userMapper.getUserListForResultMap();
        for (UserForResultMap user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setName("测试用户");
        user.setPwd("测试密码");
        try {
            int result = userMapper.addUser(user);
            System.out.println(result);
            if (result == 1) {//说明只修改成功了一条记录
                sqlSession.commit();//增删改需要提交事务才能成功
            }
        } catch (Exception e) {
            logger.error(e);
        }

        sqlSession.close();
    }

    @Test
    public void insertUser2() {
        /*利用 万能map 添加一个用户*/
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> param = new HashMap<>();
        param.put("userName", "测试用户");
        param.put("userPwd", "测试密码");
        param.put("userId", 4);
        int result = userMapper.addUser2(param);
        /*增删改需要提交事务才能成功*/
        if (result == 1) {//说明只修改成功了一条记录
            sqlSession.commit();
        }
        sqlSession.close();
    }


    @Test
    public void updateUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setName("测试修改用户");
        user.setPwd("测试修改密码");
        int result = userMapper.updateUser(user);
        if (result == 1) {//说明只修改成功
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void deleteUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.deleteUserById(4);
        if (result == 1) {//说明删除成功
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info:进入了testLog4j方法");
        logger.debug("debug:进入了testLog4j方法");
        logger.error("error:进入了testLog4j方法");
    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 2);//startIndex是数据库索引的下标,不是 startPage;
        map.put("pageSize", 2);
        List<User> userByLimit = userMapper.getUserByLimit(map);
        for (User user : userByLimit) {
            logger.info(user);
        }
        sqlSession.close();
    }
}
