package com.instrall.cn.pet_data_interface.admin.controller;

import com.instrall.cn.pet_data_interface.admin.bean.AdminBean;
import com.instrall.cn.pet_data_interface.admin.service.AdminService;
import com.instrall.cn.pet_data_interface.util.ResponseData;
import com.instrall.cn.pet_data_interface.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class AdminController {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    @Transactional
    public ResponseData<AdminBean> login(String name, String pwd){
        AdminBean adminBean=adminService.login(name,pwd);
        adminService.insertLog(adminBean.getUserid(),df.format(new Date()));
        return ResultUtil.success(adminBean);
    }



}
