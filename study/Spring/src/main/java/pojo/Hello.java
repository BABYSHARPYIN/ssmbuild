package pojo;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/29 15:31
 * @PACKAGE: pojo
 * @Software: IntelliJ IDEA
 */
public class Hello {
    private String str;

    public Hello() {
    }

    public Hello(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
