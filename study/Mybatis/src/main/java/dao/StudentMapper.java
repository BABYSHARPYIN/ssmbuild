package dao;

import pojo.Student;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 11:18
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */
public interface StudentMapper {
    //查询所有学生的信息,以及对应老师的信息
    List<Student> getStudent();

    List<Student> getStudent2();
}
