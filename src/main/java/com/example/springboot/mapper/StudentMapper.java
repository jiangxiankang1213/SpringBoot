package com.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/15 10:16
 * @param:
 */
@Mapper
@Repository
public interface StudentMapper
{
    // 根据id查询学生信息
    Student selectStudentById(Integer id);
}