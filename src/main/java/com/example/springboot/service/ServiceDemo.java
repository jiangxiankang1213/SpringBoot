package com.example.springboot.service;

import com.example.springboot.dao.DemoDao;
import com.example.springboot.dao.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class ServiceDemo {
    @Autowired
    DemoDao demoDao;
    public void testDemo() {
        int rtn = demoDao.queryDemo();
        System.out.println(rtn);
    }

}
