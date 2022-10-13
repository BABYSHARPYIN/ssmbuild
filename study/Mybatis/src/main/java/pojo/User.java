package pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.MappedTypes;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/26 16:46
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Alias("user")//实体类别名,在 UserMapper.xml中可以直接使用这个别名而无需使用全限定名
public class User {
    private int id;
    private String name;
    private String pwd;
}
