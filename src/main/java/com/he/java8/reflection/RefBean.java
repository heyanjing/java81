package com.he.java8.reflection;

import lombok.NonNull;

import java.time.LocalDate;

/**
 * Created by heyanjing on 2017/5/15 17:41.
 */
public class RefBean {
    private String    name;
    private Integer   age;
    private LocalDate birthday;

    @NonNull
    public static void msg(String msg) {
        System.out.println(msg);
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public RefBean() {

    }

    public RefBean(String name, Integer age, LocalDate birthday) {

        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
