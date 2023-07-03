package com.haitao.pb.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGateway {

    @RequestMapping(name = "/",method = RequestMethod.GET,value = "/")
    public String hello()
    {
        return "hi :)";
    }
}
