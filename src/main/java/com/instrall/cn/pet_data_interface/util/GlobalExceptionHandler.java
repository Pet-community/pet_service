package com.instrall.cn.pet_data_interface.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 系统异常处理，比如：404,500
     * @param req
     * @param resp
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("", e);
        ResponseData r = new ResponseData();
        r.setMsg(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            r.setCode(404);
            r.setMsg("API接口未找到");
        } else {
            r.setCode(500);
            r.setMsg("API接口参数异常");
        }
        r.setData(null);
        return r;
    }


}
