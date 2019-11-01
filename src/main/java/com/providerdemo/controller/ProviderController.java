package com.providerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @desc：
 * @title：ProviderController
 * @author: huangwencai
 * @date: 2019-10-23 9:54
 * @version: v4.40.0
 */
@RestController
public class ProviderController {
    @RequestMapping("provider/demo")
    public  String Demo(){
        RestTemplate t=new RestTemplate();
        //System.out.println( t.getForObject("http://www.baidu.com",String.class));
        return "hello huangpan";

    }
}