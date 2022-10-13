package dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import pojo.Teacher;
import utils.MybatisUtils;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 11:25
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */
public class TeacherMapperTest {
    static Logger logger = Logger.getLogger(TeacherMapperTest.class);

    @Test
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
