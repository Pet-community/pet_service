package com.instrall.cn.pet_data_interface.util;

public class ResultUtil {

    public static ResponseData success(Object object) {
        ResponseData result = new ResponseData();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static ResponseData success() {
        return success(null);
    }

    public static ResponseData error(Integer code, String msg) {
        ResponseData result = new ResponseData();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
