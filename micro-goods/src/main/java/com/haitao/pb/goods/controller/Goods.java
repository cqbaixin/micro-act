package com.haitao.pb.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Goods {

    @GetMapping("/")
    public String index(){
        return "hello";
    }
}
