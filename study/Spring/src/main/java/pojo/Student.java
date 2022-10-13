package pojo;

import lombok.Data;

import java.util.*;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/29 18:07
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
@Data
public class Student {
    String name;
    Address address;
    private String[] book;
    private List<String> hobbies;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;
}
