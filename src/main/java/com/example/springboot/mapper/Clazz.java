package com.example.springboot.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/15 9:46
 * @param:
 */
public class Clazz implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id; // 班级id，主键
    private String code; // 班级编号
    private String name; // 班级名称

    // 班级和学生是一对多的关系，即一个班级可以有多个学生
    private List<Student> students;

    public Clazz() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Clazz [id=" + id + ", code=" + code + ", name=" + name +"]";
    }
}