package com.example.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/14 17:07
 * @param:
 */

@Mapper
@Repository
public interface ClazzMapper {
    Clazz selectClazzById(int id);
    List<Clazz> selectClazzById2(int id);
}
