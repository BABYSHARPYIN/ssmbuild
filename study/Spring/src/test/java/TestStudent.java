import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/29 18:14
 * @PACKAGE: PACKAGE_NAME
 * @Software: IntelliJ IDEA
 */
public class TestStudent {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
