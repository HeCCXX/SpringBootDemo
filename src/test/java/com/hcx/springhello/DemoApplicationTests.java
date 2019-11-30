package com.hcx.springhello;

import com.hcx.springhello.config.MyConfig;
import com.hcx.springhello.dao.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 *测试读取配置文件中内容到容器组件中
**/

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext applicationContext;
    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }

    @Test
    void testBean(){
        MyConfig myConfig = new MyConfig();
        System.out.println(myConfig.helloPerson().toString());
        System.out.println(applicationContext.containsBean("helloPerson"));
    }

}
