package com.instrall.cn.pet_data_interface.admin.controller;

import com.instrall.cn.pet_data_interface.admin.bean.AdminBean;
import com.instrall.cn.pet_data_interface.admin.service.AdminService;
import com.instrall.cn.pet_data_interface.util.ResponseData;
import com.instrall.cn.pet_data_interface.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Api(value = "用户模块")
@RestController
@Slf4j
public class AdminController {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "账号登录", notes = "传入手机号、密码（验证码）及登录方式")
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    @Transactional
    public ResponseData<AdminBean> login(@RequestParam(value = "name", defaultValue = "电话号码") String name,
                                         @RequestParam(value = "pwd", defaultValue = "123") String pwd,
                                         @RequestParam(value = "logincode", defaultValue = "登录方式(1是验证码登录,2是密码登录)") String logincode){
        AdminBean adminBean=new AdminBean();
        ResponseData data=new ResponseData();
        if("1".equals(logincode)){
             adminService.loginCode(name);
            data= ResultUtil.success(adminBean,"登录");
        }else if ("2".equals(logincode)){
            adminBean=adminService.login(name,pwd);
            adminService.insertLog(adminBean.getUserid(),df.format(new Date()));
            data=ResultUtil.success(adminBean,"登录");
        }else{
            data= ResultUtil.resultMsg(adminBean,500,"登陆类型有误","登录");
        }

        return data;
    }


    @ApiOperation(value = "账号注册", notes = "传入用户名和密码")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @Transactional
    public ResponseData<AdminBean> resg(@RequestParam(value = "name", defaultValue = "电话号码") String name, @RequestParam(value = "code", defaultValue = "验证码") String code){

        AdminBean adminBean=new AdminBean();
        ResponseData data=new ResponseData();
        if("888888".equals(code)){
           int resultId=adminService.loginCode(name);
           if (resultId>0){
               data= ResultUtil.resultMsg(adminBean,200,"注册成功","注册");
           }else{
               data= ResultUtil.resultMsg(adminBean,404,"注册失败","注册");
           }
        }else{
            data= ResultUtil.resultMsg(adminBean,500,"验证码错误","注册");
        }

        return data;
    }

}
