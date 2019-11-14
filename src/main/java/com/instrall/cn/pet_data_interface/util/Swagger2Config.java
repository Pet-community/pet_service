package com.instrall.cn.pet_data_interface.util;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sam
 * @since 2017/7/17
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Config {

//    @Bean
//    public Docket createRestApi() {
//
//        ApiInfo apiInfo = new ApiInfoBuilder()
//                .title("Pet 项目接口文档")
//                .description("Pet 项目的接口文档")
//                .contact("迟到的微笑")
//                .version("1.0")
//                .build();
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface")) //以扫描包的方式
//                .paths(PathSelectors.any())
//                .build();
//    }


    @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .groupName("资源管理")
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface"))
                    .paths(PathSelectors.any())
                    .build();
    }
//    @Bean
//        public Docket createMonitorRestApi() {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfo())
//                    .groupName("实时监测")
//                    .select()
//                    .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface"))
//                    .paths(PathSelectors.any())
//                    .build();
//    }
//    @Bean
//        public Docket createActivitiRestApi() {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfo())
//                    .groupName("工作流引擎")
//                    .select()
//                    .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface"))
//                    .paths(PathSelectors.any())
//                    .build();
//    }
//        @Bean
//        public Docket createBaseRestApi() {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfo())
//                    .groupName("kernel模块")
//                    .select()
//                    .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface"))
//                    .paths(PathSelectors.any())
//                    .build();
//    }
//
//        @Bean
//        public Docket createComplaintRestApi() {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfo())
//                    .groupName("投诉管理")
//                    .select()
//                    .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface"))
//                    .paths(PathSelectors.any())
//                    .build();
//    }
        private ApiInfo apiInfo() {
           return new ApiInfoBuilder()
                   .title("Pet 项目接口文档")
                   .description("Pet 项目的接口文档")
                   .contact("迟到的微笑")
                   .version("1.0")
                   .build();
    }

    /**
     * 全局参数
     *
     * @return List<Parameter>
     */
//    private List<Parameter> parameter() {
//        List<Parameter> params = new ArrayList<>();
//        params.add(new ParameterBuilder().name("token")
//                .description("认证令牌")
//                .defaultValue("暂不需要")
//                .modelRef(new ModelRef("string"))
//                .parameterType("header")
//                .required(false).build());
//        return params;
//    }

//    @Bean
//    public Docket sysApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                //Swagger UI默认显示所有接口
//                .apis(RequestHandlerSelectors.basePackage("com.instrall.cn.pet_data_interface"))
//                .paths(PathSelectors.any())
//                .build().globalOperationParameters(parameter());
//    }

}
