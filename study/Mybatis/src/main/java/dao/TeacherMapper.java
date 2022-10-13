package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Teacher;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/9/28 11:18
 * @PACKAGE: dao
 * @Software: IntelliJ IDEA
 */
public interface TeacherMapper {
    Teacher getTeacher(@Param("tid") int id);

}
