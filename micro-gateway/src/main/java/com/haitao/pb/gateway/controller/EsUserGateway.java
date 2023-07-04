package com.haitao.pb.gateway.controller;

import com.haitao.pb.common.response.Result;
import com.haitao.pb.service.impl.elasticsearch.user.UserInterface;
import com.haitao.pb.service.model.elasticsearch.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/EsUser")
public class EsUserGateway {

    @Autowired
    private UserInterface userInterface;

    @RequestMapping(method= RequestMethod.GET,value = "/findAll")
    public Result findAll()
    {
       return Result.success(userInterface.findAll());
    }

    @RequestMapping(method= RequestMethod.GET,value = "/save")
    public Result save()
    {
        User user = new User();
        user.setAge(18);
        Long id = 3L;
        user.setId(id);
        user.setName("act.bai");
        user.setIntroduce("什么值得买丫丫!!");
        userInterface.save(user);
        return Result.success("ok");
    }

    @RequestMapping(method= RequestMethod.GET,value = "/findById")
    public Result findById()
    {
        User es =  userInterface.findById("3");
        return Result.success(es);
    }

    @RequestMapping(method= RequestMethod.GET,value = "/findByAge")
    public Result findByAge(@RequestParam(required = false,name = "age") Integer age,@RequestParam Integer page )
    {
        if(age == null){
            age = 18;
        }
        if(page == null){
            page = 0;
        }
        Page<User> resPage =  userInterface.findByAge(age, PageRequest.of(page,20));
        return Result.success(resPage);
    }


}
