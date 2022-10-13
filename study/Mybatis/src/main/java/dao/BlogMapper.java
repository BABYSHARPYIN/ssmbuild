package dao;

import pojo.Blog;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 16:47
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //根据条件查询 blog
    List<Blog> queryBlogIf(Blog blog);

    List<Blog> queryBlogChoose(Blog blog);

   int updateBlog(Blog blog);

   List<Blog> queryBlogForEach(List<String> title);

}
