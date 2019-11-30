package com.hcx.springhello.config;

import com.hcx.springhello.dao.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-11-30 16:07
 * @Version 1.0
 **/

@Configuration
public class MyConfig {

    @Bean
    public Person helloPerson(){
        System.out.println("容器添加组件。。。。");
        return new Person();
    }
}
