package com.instrall.cn.pet_data_interface.util;

public class ResultUtil {

    public static ResponseData success(Object object,String function) {
        ResponseData result = new ResponseData();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        result.setFunction(function);
        return result;
    }

    public static ResponseData success(String function) {
        return success(null,function);
    }

    public static ResponseData error(Integer code, String msg,String function) {
        ResponseData result = new ResponseData();
        result.setCode(code);
        result.setMsg(msg);
        result.setFunction(function);
        return result;
    }


    public static ResponseData resultMsg(Object data,Integer code, String msg,String function) {
        ResponseData result = new ResponseData();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        result.setFunction(function);
        return result;
    }

}
