package com.instrall.cn.pet_data_interface.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseData<T> {
    /** 状态码码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;

}
