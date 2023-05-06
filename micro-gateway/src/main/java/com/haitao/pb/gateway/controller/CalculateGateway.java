package com.haitao.pb.gateway.controller;

import com.haitao.pb.gateway.feign.client.CalculateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/calculate")
public class CalculateGateway {

    @Resource
    CalculateClient calculateClient;

    @RequestMapping(name = "list",method = RequestMethod.GET, path = "/list")
    public List<String> getList()
    {
        List<String> resList = calculateClient.getCalculate();
        return resList;
    }

    @RequestMapping(name = "add",method = RequestMethod.POST, path = "/add")
    public int getList(@RequestParam(name="number") int number, @RequestParam(name="number1") int number1)
    {
        int res = calculateClient.add(number,number1);
        return res;
    }

}
