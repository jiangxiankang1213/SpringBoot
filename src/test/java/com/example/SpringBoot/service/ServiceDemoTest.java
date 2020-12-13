package com.example.SpringBoot.service;

import com.example.springboot.dao.DemoDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ServiceDemoTest {
    @Autowired
    DemoDao demoDao;
    @Test
    public void testDemo() {
        /*String rtn = demoDao.queryDemo();
        System.out.println(rtn);*/
    }
}