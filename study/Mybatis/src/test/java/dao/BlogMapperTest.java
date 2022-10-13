package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import pojo.Blog;
import utils.IDUtils;
import utils.MybatisUtils;

import java.util.*;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 17:02
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */
public class BlogMapperTest {
    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog params = new Blog();
        params.setTitle("微服务");
        List<Blog> blogs = mapper.queryBlogIf(params);
        blogs.forEach(System.out::print);
    }
    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog params = new Blog();
//        params.setTitle("微服务");
//        params.setAuthor("狂神说");
        List<Blog> blogs = mapper.queryBlogChoose(params);
        blogs.forEach(System.out::print);
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog params = new Blog();
        params.setTitle("Mybatis");
        params.setAuthor("狂神说");
        params.setId("0b97d387d9c34c2fa0980ea685cd0005");
        int i = mapper.updateBlog(params);
        if (i == 1) {
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        ArrayList<String>  list = new ArrayList<String>();
        list.add("Mybatis");
        list.add("微服务");
        List<Blog> blogs = mapper.queryBlogForEach(list);
        blogs.forEach(System.out::println);
    }
}
