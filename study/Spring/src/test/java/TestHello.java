import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/29 15:36
 * @PACKAGE: PACKAGE_NAME
 * @Software: IntelliJ IDEA
 */
public class TestHello {
    @Test
    public void test() {
        //获取 spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("hello"));
    }
}
