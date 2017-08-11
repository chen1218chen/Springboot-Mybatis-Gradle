package com.cc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
    		.apiInfo(apiInfo())
    		.select()
    		.apis(RequestHandlerSelectors.basePackage("com.cc.controller"))
    		.paths(PathSelectors.any())
    		.build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
    		.title("Gradle构建Spring boot项目")
    		.description("Gradle构建Spring boot项目 集成mybatis使用pagehelper插件 ，实现热部署 by 陈晨")
    		.termsOfServiceUrl("http://blog.csdn.net/chen1218chen")
    		.contact("chenchen")
    		.version("1.0")
    		.build();
  }

}