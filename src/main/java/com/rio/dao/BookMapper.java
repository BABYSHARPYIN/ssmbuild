package com.rio.dao;

import com.rio.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/10 14:15
 * @PACKAGE: com.rio.dao
 * @Software: IntelliJ IDEA
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部书
    List<Books> queryAllBook();
}
