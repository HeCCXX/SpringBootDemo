package com.hcx.springhello.dao;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2019-11-30 14:59
 * @Version 1.0
 **/
public class Dog {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
