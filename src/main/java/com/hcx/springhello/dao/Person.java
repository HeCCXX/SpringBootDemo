package com.hcx.springhello.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


/**
*将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties(prefix = "person")  将前缀为xxx的所有属性进行一一映射
 * 还需要添加@Component组件注解使功能生效
**/
@Component
@PropertySource("classpath:person.properties")
@ConfigurationProperties(prefix = "person")
public class Person {

//    @Value("${person.name}")
    private String name;
    private Integer age;
    private List list;
    private Dog dog;
    private Map kv;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", dog=" + dog +
                ", kv=" + kv +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map getKv() {
        return kv;
    }

    public void setKv(Map kv) {
        this.kv = kv;
    }
}
