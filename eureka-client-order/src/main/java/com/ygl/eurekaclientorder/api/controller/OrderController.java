package com.ygl.eurekaclientorder.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ygl
 * @create 2019-01-16
 * @DESCRIPTION
 **/
@RestController
public class OrderController {
    /**
     * springboot web组件提供
     * 默认整合ribbon负载均衡器
     * rest方式底层采用httpclient
     */
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getOrder")
    public String getOrder(){
        String object = restTemplate.getForObject("http://localhost:8000/getMember", String.class);
        System.out.println("订单服务调用会员服务得到的结果："+object);
        return object;
    }

    /**
     * restTemplate通过别名调用需要依赖ribbon
     * @return
     */
    @GetMapping("/getOrder1")
    public String getOrder1(){
        String url = "http://client-member/getMember";
        String object = restTemplate.getForObject(url, String.class);
        System.out.println("订单服务调用会员服务得到的结果："+object);
        return object;
    }
}
