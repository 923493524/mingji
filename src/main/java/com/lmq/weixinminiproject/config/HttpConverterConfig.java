package com.lmq.weixinminiproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HttpConverterConfig implements WebMvcConfigurer {

    @Configuration
    public class WebMVCConfig extends WebMvcConfigurationSupport {

        // 路径映射配置
        @Override
        protected void addResourceHandlers(ResourceHandlerRegistry registry) {


            registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
            // 磁盘目录
            String path = "C:/img/";
            // 将网页地址栏中的 /image/**  映射到  磁盘的某个目录下，以访问磁盘资源
            registry.addResourceHandler("/image/**").addResourceLocations("file:" + path);

        }

    }


}

