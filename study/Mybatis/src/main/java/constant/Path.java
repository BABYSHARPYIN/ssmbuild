package constant;

import lombok.Getter;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/26 16:40
 * @PACKAGE: constant
 * @Software: IntelliJ IDEA
 */
@Getter
public enum Path {
    mybatisConfig("mybatis-config.xml");
    final String path;
    Path(String path) {
        this.path = path;
    }
}
