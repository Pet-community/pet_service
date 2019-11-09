package com.instrall.cn.pet_data_interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching  //开启缓存
public class PetDataInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetDataInterfaceApplication.class, args);
    }

}


//@SpringBootApplication
//@EnableCaching  //开启缓存
//public class PetDataInterfaceApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(PetDataInterfaceApplication.class, args);
//    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(PetDataInterfaceApplication.class);
//    }
//}
