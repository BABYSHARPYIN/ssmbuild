package com.rio.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/10 14:11
 * @PACKAGE: com.rio.pojo
 * @Software: IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
