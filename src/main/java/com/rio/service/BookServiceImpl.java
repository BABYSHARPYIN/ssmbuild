package com.rio.service;

import com.rio.dao.BookMapper;
import com.rio.pojo.Books;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/10 15:30
 * @PACKAGE: com.rio.service
 * @Software: IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

}
