package com.rio.service;

import com.rio.pojo.Books;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestBookService {
    @Test
    public void queryAllBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        List<Books> books = bookService.queryAllBook();
        books.forEach(System.out::println);
    }
}
