package pojo;

import lombok.Data;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 11:16
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
