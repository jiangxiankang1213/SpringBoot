package com.example.springboot.dao;

import org.springframework.stereotype.Component;

@Component
public class ServiceDao {
    public String testDemo(){
        String rtnAfterDosomething = "我是返回结果";
        //这里是业务代码
        return rtnAfterDosomething;
    }

}
