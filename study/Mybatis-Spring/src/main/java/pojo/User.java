package pojo;

import lombok.Data;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 17:11
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
@Data
public class User {
    private int id;
    private String name;
    private String password;//与数据库不一致,利用 mybatis 中的 resultMap 解决
}
