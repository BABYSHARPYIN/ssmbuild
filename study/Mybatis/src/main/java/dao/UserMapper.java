package dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;
import pojo.UserForResultMap;

import java.util.List;
import java.util.Map;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/26 16:51
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */
public interface UserMapper {
     @Select("select * from User")
     List<User> getUserForAnnotation();//使用注解查询用户

     List<User> getUserList();
     List<UserForResultMap> getUserListForResultMap();//mybatis 结果集映射
     List<User> getUserByLimit(Map<String,Integer> map); //分页查询
     // 方法存在多个参数所有参数前应该加@Param注解(引用对象除外),这里的 id 映射 xml 中 sql 的#{id}
     User getUserById(@Param("id") int userId);
     int addUser(User user);
     int addUser2(Map<String,Object> map);////万能 map 映射
     int updateUser(User user);
     int deleteUserById(int userId);

}
