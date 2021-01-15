package com.example.springboot.controller;

import com.example.springboot.mapper.Clazz;
import com.example.springboot.service.ClazzService;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/15 10:02
 * @param:
 */
@RestController
@RequestMapping("/testBoot")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @RequestMapping("getClazz/{id}")
    public String GetClazz(@PathVariable int id) {
        return clazzService.Sel(id).toString();
    }

    @RequestMapping("getClazz2/{id}")
    public String GetStudent(@PathVariable int id) {
        return clazzService.Sel2(id).toString();
    }

    @RequestMapping("getClazz3/{id}")
    public String GetStudent2(@PathVariable int id) {
        return clazzService.Sel3(id).toString();
    }

}
