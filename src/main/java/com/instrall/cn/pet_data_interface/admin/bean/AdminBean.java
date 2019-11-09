package com.instrall.cn.pet_data_interface.admin.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class AdminBean implements Serializable {
    private String userid;
    private String name;
    private String name_nc;
    private String pwd;
    private String img;
    private String address;
    private String phone;
    private String email;
}
