package pojo;

import lombok.Data;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 11:15
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
@Data
public class Student {
    private int id;
    private String name;
    //每个学生需要关联一个老师
    private Teacher teacher;
    private int tid;
}
