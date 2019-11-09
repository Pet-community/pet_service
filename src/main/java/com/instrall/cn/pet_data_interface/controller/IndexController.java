package com.instrall.cn.pet_data_interface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

//@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        System.out.println(new Date());
        return "index";
    }


}
