package com.fh.shop.classify.controller;

import com.fh.shop.classify.biz.IClassifyService;
import com.fh.shop.jar.ServerException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/classify")
@CrossOrigin("http://localhost:8000")
public class ClassifyController {

    @Resource(name = "classifyService")
    private IClassifyService iClassifyService;

    @GetMapping
    public ServerException queryById(Integer id){
        return iClassifyService.queryById(id);
    }
}
