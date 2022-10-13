package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.User;
import pojo.config.JavaConfig;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 10:03
 * @PACKAGE: config
 * @Software: IntelliJ IDEA
 */
public class TestConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);//通过类注册 bean
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
