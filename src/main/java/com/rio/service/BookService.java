package com.rio.service;

import com.rio.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/10 15:29
 * @PACKAGE: com.rio.service
 * @Software: IntelliJ IDEA
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部书
    List<Books> queryAllBook();
}
