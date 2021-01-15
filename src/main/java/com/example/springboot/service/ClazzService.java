package com.example.springboot.service;

import com.example.springboot.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/15 10:04
 * @param:
 */
@Service
public class ClazzService {
    @Autowired
    ClazzMapper clazzMapper;
    @Autowired
    StudentMapper studentMapper;

    public Clazz Sel(int id){
        return clazzMapper.selectClazzById(id);

    }
    public Student Sel2(int id){
        return studentMapper.selectStudentById(id);

    }
    public List<Clazz> Sel3(int id){
        return clazzMapper.selectClazzById2(id);

    }
}
