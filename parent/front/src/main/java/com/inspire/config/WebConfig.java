package com.inspire.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//生效配置，使之就像传统项目里sping的xml配置文件一样
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    //注册成bean，就像传统项目spring配置文件中的<bean>标签
    @Bean
    public FilterRegistrationBean siteMeshFilter(){
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        //实例化一个过滤器类
        WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }
}