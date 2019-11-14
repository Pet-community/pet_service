package com.instrall.cn.pet_data_interface.admin.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@ApiModel(value = "admin用户表")
public class AdminBean implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Integer userid;
    @ApiModelProperty(value = "用户账号")
    private String name;
    @ApiModelProperty(value = "用户昵称")
    private String name_nc;
    @ApiModelProperty(value = "用户密码")
    private String pwd;
    @ApiModelProperty(value = "用户图像")
    private String img;
    @ApiModelProperty(value = "用户地址")
    private String address;
    @ApiModelProperty(value = "用户手机号码")
    private String phone;
    @ApiModelProperty(value = "用户邮箱地址")
    private String email;
}
