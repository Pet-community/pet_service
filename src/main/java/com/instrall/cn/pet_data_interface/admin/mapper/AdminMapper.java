package com.instrall.cn.pet_data_interface.admin.mapper;

import com.instrall.cn.pet_data_interface.admin.bean.AdminBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {



    /**
     * 登录
     *
     */
    @Select("select * from users where name=#{name} and pwd=#{pwd}")
    AdminBean login(@Param("name") String name,@Param("pwd") String pwd);


    /**
     * 添加登录日志
     */
    @Insert("insert into login(userid,time) values(#{userid},#{time})")
    int insertLog(@Param("userid") String userid,@Param("time") String time);
}
