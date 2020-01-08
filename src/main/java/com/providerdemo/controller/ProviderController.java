package com.providerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
        return "providerDemo";
    }
}