package com.haitao.pb.gateway.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(name = "goods-service" ,path = "/calculate/") //name的值是注册到注册中心的服务名,path是前缀
public interface CalculateClient {
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    List<String> getCalculate();

    @RequestMapping(method = RequestMethod.POST,value = "/add")
    int add(@RequestParam(name="number") int number,@RequestParam(name="number1") int number1);

}
