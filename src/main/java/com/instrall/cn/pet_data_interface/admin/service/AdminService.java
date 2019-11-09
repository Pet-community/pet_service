package com.instrall.cn.pet_data_interface.admin.service;

import com.instrall.cn.pet_data_interface.admin.bean.AdminBean;
import com.instrall.cn.pet_data_interface.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @Cacheable将查询结果缓存到redis中，（key=”#p0”）指定传入的第一个参数作为redis的key。
 * @CachePut，指定key，将更新的结果同步到redis中
 * @CacheEvict，指定key，删除缓存数据，allEntries=true,方法调用后将立即清除缓存
 * ————————————————
 * 版权声明：本文为CSDN博主「跟派大星学编程」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/junmoxi/article/details/80913060
 *
 */
@Service
@CacheConfig(cacheNames = "admin")
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;


    public AdminBean login(String name,String pwd){
        return adminMapper.login(name,pwd);
    }

    public int insertLog(String userid,String time){
        return adminMapper.insertLog(userid,time);
    }


}
