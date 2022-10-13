package utils;


import java.util.UUID;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 16:51
 * @PACKAGE: utils
 * @Software: IntelliJ IDEA
 */
@SuppressWarnings("all")
public class IDUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
