package utils;

import constant.Path;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/26 16:38
 * @PACKAGE: utils
 * @Software: IntelliJ IDEA
 */
public class MybatisUtils {
    private static final SqlSessionFactory sqlSessionFactory;
    static {
        String resource;
        InputStream inputStream = null;
        try {
            resource = Path.mybatisConfig.getPath();
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();//openSession设置为 true 则开启自动提交事务
    }
}
