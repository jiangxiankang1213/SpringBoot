package com.example.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class MybatisServiceDemo {
    /*@Autowired
    DemoDao demoDao;*/
    public String testDemo(){
        String rtnAfterDosomething = "我是返回结果";
        //这里是业务代码
        return rtnAfterDosomething;
    }
    /*public String queryDemo(){
        return demoDao.queryDemo();
    }*/
}
