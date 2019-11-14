package com.instrall.cn.pet_data_interface.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(value = "统一数据返回格式")
public class ResponseData<T> {
    /** 状态码码. */
    @ApiModelProperty(value = "状态码")
    private Integer code;

    /** 提示信息. */
    @ApiModelProperty(value = "提示信息")
    private String msg;

    /** 具体的内容. */
    @ApiModelProperty(value = "体的内容")
    private T data;

    /**
     * 功能说明
     */
    @ApiModelProperty(value = "功能描述")
    private String function;
}
