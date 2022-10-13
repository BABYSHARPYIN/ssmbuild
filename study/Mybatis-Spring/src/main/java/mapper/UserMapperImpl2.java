package mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;

import java.util.List;


/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/9 10:13
 * @PACKAGE: mapper
 * @Software: IntelliJ IDEA
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    private final SqlSession sqlSession = getSqlSession();
    /**
     * Set MyBatis SqlSessionFactory to be used by this DAO.
     * Will automatically create SqlSessionTemplate for the given SqlSessionFactory.
     *
     * @param sqlSessionFactory a factory of SqlSession
     */
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> selectUsers() {
        return sqlSession.getMapper(UserMapper.class).selectUsers();
    }

    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUserById(id);

    }


}
