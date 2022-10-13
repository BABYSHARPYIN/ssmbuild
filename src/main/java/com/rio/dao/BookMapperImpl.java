package com.rio.dao;

import com.rio.pojo.Books;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/10 15:41
 * @PACKAGE: com.rio.dao
 * @Software: IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper{
    private SqlSessionTemplate sqlSessionTemplate;
    BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);

    @Override
    public int addBook(Books books) {

        return mapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return mapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return mapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return mapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return mapper.queryAllBook();
    }
}
