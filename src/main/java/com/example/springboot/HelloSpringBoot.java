package com.example.springboot;

import com.example.springboot.dao.DemoDao;
import com.example.springboot.dao.ServiceDao;
import com.example.springboot.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloSpringBoot {
    @Autowired
    ServiceDemo serviceDemo;
    @Autowired
    DemoDao demoDao;
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        //serviceDemo.testDemo();
        System.out.println("hello spring boot");
        return "ee";
    }

    @RequestMapping(path = {"/helloSpringBoot2"})
    public String HelloSpring2 (){
        int a=demoDao.queryDemo();
        System.out.println(a);
        return "hello spring boot";
    }
}