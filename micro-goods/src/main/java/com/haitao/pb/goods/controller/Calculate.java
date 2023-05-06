package com.haitao.pb.goods.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/calculate")
public class Calculate {

    @RequestMapping(name = "list",method = RequestMethod.GET, path = "/list")
    public List<String> getList()
    {
        List<String> resList = new ArrayList<>();
        resList.add("add");
        resList.add("sub");
        resList.add("mul");
        resList.add("div");
        return resList;
    }

    @RequestMapping(name = "add" ,method = RequestMethod.POST, path = "/add")
    public int add(@RequestParam("number") int number ,@RequestParam("number1") int number1)
    {
        int res = number + number1;
        return res;
    }

}
