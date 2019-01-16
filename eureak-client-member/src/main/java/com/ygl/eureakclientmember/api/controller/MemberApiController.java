package com.ygl.eureakclientmember.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ygl
 * @create 2019-01-16
 * @DESCRIPTION
 **/
@RestController
public class MemberApiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getMember")
    public String getMember(){
        return "this is member ,port:"+port;
    }
}
