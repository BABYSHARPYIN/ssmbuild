package autowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.autowired.People;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/30 11:30
 * @PACKAGE: autowired
 * @Software: IntelliJ IDEA
 */
public class TestPeople {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredBean.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
