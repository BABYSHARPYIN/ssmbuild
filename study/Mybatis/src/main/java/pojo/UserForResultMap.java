package pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;

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
public class UserForResultMap {
    private int id;
    private String name;
    private String password;
}
