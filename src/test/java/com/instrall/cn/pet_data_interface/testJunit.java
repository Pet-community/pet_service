package com.instrall.cn.pet_data_interface;

import com.instrall.cn.pet_data_interface.admin.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testJunit {

    @Autowired
    private AdminService adminService;

    @Test
    public void login(){

    }

}
