package pojo;
import lombok.Data;
import java.util.Date;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 16:44
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致使用mapUnderscoreToCamelCase将 xxx_xxx 转换为 xxxXxx
    private int views;
}
