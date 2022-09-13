package com.wangwei.wiki.controller;

import com.wangwei.wiki.domain.Test;
import com.wangwei.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @author: wangwei
 * @date: 2022年09月08日 21:47
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/helloPost")
    public String helloPost(String name){
        return name + ", hello world!";
    }

    @GetMapping("/test/list")
    public List <Test> list(){
        return testService.list();
    }

}
