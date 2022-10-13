package pojo.autowired;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/30 11:27
 * @PACKAGE: pojo.Autowired
 * @Software: IntelliJ IDEA
 */
@Data
public class People {
    @Autowired
    private Cat cat;
    @Autowired//自动装配,byName& byType
    @Qualifier("dog")//指定装配 bean 的 id
    private Dog dog;
    private String name;
}
