package com.hcx.springhello;

import com.hcx.springhello.dao.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *测试读取配置文件中内容到容器组件中
**/

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }

}
