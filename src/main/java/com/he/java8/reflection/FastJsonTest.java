package com.he.java8.reflection;

import com.alibaba.fastjson.JSON;

import java.time.LocalDate;

/**
 * Created by heyanjing on 2017/5/16 9:45.
 */
public class FastJsonTest {
    public static void main(String[] args) {
        RefBean bean = new RefBean("何彦静",28,LocalDate.now());
        String json = JSON.toJSONString(bean);
        System.out.println(json);
        RefBean refBean = JSON.parseObject(json, RefBean.class);
        System.out.println(refBean);

    }
}
