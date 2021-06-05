package com.gupaoedu.Myconfig;

import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * Administrator
 * 2021/4/14
 */
@Resource
public class Myconfig {
    @Bean
    public void person(){
        System.out.println("测试。。。");
    }
}
